package atividadeBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<Conta>();

    public List<Conta> getContas() {
        return contas;
    }

    public void inserir(Conta conta){

        // ---------------------->Questão13<------------------.

        try{
            consultar(conta.getNumero());
        } catch (ContaInexistenteError contaInexistente){
            contas.add(conta);
        }

    }
    public Conta consultar(String numero){
        Conta contaProcurada = null;

        for (int i = 0; i < contas.size(); i++){
            if (contas.get(i).getNumero().equals(numero)) {
                contaProcurada = contas.get(i);
                break;
            }
        }

        // ---------------------->Questão8<------------------.

        if(contaProcurada == null){
            throw new ContaInexistenteError("A conta procurada ainda não existe!");
        }

        return contaProcurada;
    }
    private int consultarPorIndice(String numero){
        int indiceProcurado = -1;

        for(int i = 0; i < contas.size(); i++){
            if (contas.get(i).getNumero().equals(numero)){
                indiceProcurado = i;
                break;
            }
        }

        // ---------------------->Questão8<------------------.

        if(indiceProcurado == -1){
            throw new ContaInexistenteError("A conta procurada ainda não existe!");
        }

        return indiceProcurado;
    }
    public void alterar(Conta conta){
        int indiceProcurado = consultarPorIndice(conta.getNumero());

        /*
        ---------------------->Questão9<------------------.

        if (indiceProcurado != -1){
            contas.set(indiceProcurado, conta);
        }
        */
    }
    public void excluir(String numero){
        int indiceProcurado = consultarPorIndice(numero);

        if(indiceProcurado != -1){
            for (int i = indiceProcurado; i < contas.size(); i++){
                contas.set(i, contas.get(i + 1));
            }
            contas.remove(contas.size() - 1);
        }
    }
    public void depositar(String numero, double valor){
        Conta contaProcurada = consultar(numero);
        contaProcurada.depositar(valor);

        /*
        ---------------------->Questão9<------------------.

        if(contaProcurada != null){
           contaProcurada.depositar(valor);
        }
        */
    }
    public void sacar(String numero, double valor){
        Conta contaProcurada = consultar(numero);
        contaProcurada.sacar(valor);
        /*
        ---------------------->Questão9------------------.
        if(contaProcurada != null){
           contaProcurada.sacar(valor);
        }
        */
    }
    public void transferir(String numDestino, String numOrigem, double valor){
        Conta contaDestino = consultar(numDestino);
        Conta contaOrigem = consultar(numOrigem);
        contaOrigem.transferir(contaDestino, valor);

        /*
         ---------------------->Questão9<------------------.
        if(contaDestino != null && contaOrigem != null){
            contaOrigem.transferir(contaDestino, valor);
        }

        */
    }
    public int qtdContas(){
        return contas.size();
    }
    public double totalDepositado(){
        double total = 0;

        for (Conta conta : contas) {
            total += conta.consultarSaldo();
        }

        return total;
    }
    public double mediaDepositado(){
        return totalDepositado() / qtdContas();
    }
    public void renderJuros(String numero){
        Conta contaDesejada = consultar(numero);

        // // ---------------------->Questão12<------------------.
        if(!(contaDesejada instanceof Poupanca)){
            throw new PoupancaInvalidaError("A conta informada não é uma  conta poupança!");
        }

        ((Poupanca)contaDesejada).renderJuros();
    }
}


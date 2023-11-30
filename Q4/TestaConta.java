package atividadeBanco.Q4;

import atividadeBanco.Conta;

public class TestaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("1111-1", "Rapunzel da Silva", 10);
        Conta conta2 = new Conta("2222-2", "Jaspion Sousa", 30);
        Conta conta3 = new Conta("3333-3","Raimundo Kakashi",65);
        conta2.transferir(conta1, 20);
        conta3.transferir(conta2,75);
        conta1.transferir(conta3, 1000);
    }
}

/*
error:

    Exception in thread "main" java.lang.Error: Saldo insuficiente
	at atividadeBanco.Q4.Conta.sacar(Conta.java:62)
	at atividadeBanco.Q4.Conta.Conta.transferir(Conta.java:93)
	at atividadeBanco.Q4.Conta.TestaConta.main(TestaConta.java:11)



    Com o metodo logo abaixo, não era executado nenhuma exceção, o programa executaria normalmente mas n iria
    ser transferido nenhuma valor.

  #################  metodo antigo:###################################
    public boolean transferir(Conta ContaDestino, double valor){
        if (_saldo < 0 || _saldo - valor < 0){
            return false;
        }
        this.sacar(valor);
        ContaDestino.depositar(valor);
        return true;
    }

 */
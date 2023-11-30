package atividadeBanco;

public class Conta {
    private String _numero;
    private String _titular;
    private double _saldo;

    public Conta(String numero, double saldo) throws ValorInvalidoError{
        /*
               ---------------------->Questão6<------------------.
        if(saldo < 0){
            throw new RuntimeException("Valor inválido! (menor do que 0)"); // 06ª questão - lançamento no construtor

            throw new ValorInvalidoError("Valor inválido! O valor deve ser maior do que 0.");
        }
        */


        validaValor(saldo);    //       ---------------------->Questão11<------------------.

        _numero = numero;
        _saldo = saldo;
    }

    public Conta(String numero, String titular, double saldo) throws ValorInvalidoError{
        /*
        ---------------------->Questão6<------------------.
        if(saldo < 0){

        throw new RuntimeException("Valor inválido! (menor do que 0)"); // 06ª questão - lançamento no construtor
        throw new ValorInvalidoError("Valor inválido! O valor deve ser maior do que 0.");
        }
        */

        validaValor(saldo);

        _numero = numero;
        _titular = titular;
        _saldo = saldo;
    }

    public void sacar(double valor) throws ValorInvalidoError, SaldoInsuficienteError{

        /*
             ---------------------->Questão3<------------------.
        if (this._saldo < valor){
            throw new RuntimeException("Saldo insuficiente");
        }
               ---------------------->Questão6<------------------.
        if (valor < 0){
            throw new RuntimeException("Valor fornecido menor do que 0!");

              ---------------------->Questão10<------------------.
            throw new ValorInvalidoError("Valor inválido! O valor deve ser maior do que 0.");
        }
        */


        validaValor(valor);

        if (this._saldo < valor){
            throw new SaldoInsuficienteError("Saldo insuficiente!!");
        }

        _saldo -= valor;
    }

    public void depositar(double valor) throws ValorInvalidoError, SaldoInsuficienteError{

        /*

               ---------------------->Questão6<------------------.
        if (valor < 0){


            throw new RuntimeException("Valor fornecido menor do que 0!");

            throw new ValorInvalidoError("Valor inválido! O valor deve ser maior do que 0.");
        }

         */

        validaValor(valor);
        _saldo += valor;
    }

    public double consultarSaldo(){
        return this._saldo;
    }

    public void transferir(Conta ContaDestino, double valor) throws ValorInvalidoError, SaldoInsuficienteError{
        //        ---------------------->Questão4<------------------.
        this.sacar(valor);
        ContaDestino.depositar(valor);
    }

    public String getNumero() {
        return _numero;
    }

    public String getTitular() {
        return _titular;
    }

    public double getSaldo() {
        return _saldo;
    }

    private void validaValor(double valor) throws ValorInvalidoError{
        if(valor < 0){
            throw new ValorInvalidoError("Valor inválido! O valor deve ser maior do que 0 !");
        }
    }
}

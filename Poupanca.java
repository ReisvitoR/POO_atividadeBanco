package atividadeBanco;
public class Poupanca extends Conta {
    private double _taxaJuros;

    public Poupanca(String numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        _taxaJuros = taxaJuros;
    }
    public Poupanca(String numero, double saldo, double _taxaJuros) {
        super(numero, saldo);
        this._taxaJuros = _taxaJuros;
    }
    public void renderJuros(){
        this.depositar(this.getSaldo() * (this._taxaJuros/100));
    }
    public double getTaxaJuros(){
        return _taxaJuros;
    }
}

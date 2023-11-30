package atividadeBanco;

public class ContaImposto extends Conta {
    private double _taxaDesconto;

    public ContaImposto(String numero, String titular, double saldo, double taxaDesconto) {super(numero, titular, saldo);
        _taxaDesconto = taxaDesconto;
    }

    public ContaImposto(String numero, double saldo, double _taxaDesconto) {super(numero, saldo);
        this._taxaDesconto = _taxaDesconto;
    }

    @Override
    public void sacar(double valor){
        super.sacar(valor);
        super.sacar(valor*getTaxaDesconto()/100);
    }

    public double getTaxaDesconto(){
        return _taxaDesconto;
    }
}

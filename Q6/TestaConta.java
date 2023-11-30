package atividadeBanco.Q6;

import atividadeBanco.Conta;

public class TestaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("1111-1", "Rapunzel da Silva", 10);
        Conta conta2 = new Conta("2222-2", "Jaspion Sousa", 30);
        Conta conta3 = new Conta("3333-3","Raimundo Kakashi",65);
        conta1.depositar(-20);
        conta1.sacar(-80);
        conta2.depositar(-10);
        conta2.sacar(-30);
        conta3.depositar(-10);
        conta3.sacar(-10);
    }
}

/*


    Exception in thread "main" java.lang.Error: Saldo inválido! Valor Negativo!!
    at atividadeBanco.Conta.<init>(Conta.java:21)
    at atividadeBanco.Q6.TestaConta.main(TestaConta.java:10)

    Process finished with exit code 1

    Exception in thread "main" java.lang.Error: Valor negativo!!
	at atividadeBanco.Conta.depositar(Conta.java:83)
	at atividadeBanco.Q6.TestaConta.main(TestaConta.java:11)

	Process finished with exit code 1

 */
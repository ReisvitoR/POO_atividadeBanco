package atividadeBanco.Q3;

import atividadeBanco.Conta;

public class TestaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("1111-1", "Rapunzel da Silva", 10);
        Conta conta2 = new Conta("2222-2", "Jaspion Sousa", 30);
        Conta conta3 = new Conta("3333-3","Raimundo Kakashi",65);
        conta1.sacar(500);
        conta2.sacar(70);
        conta3.sacar(150);
    }
}

/*
   Exception in thread "main" java.lang.Error: Saldo insuficiente
	at atividadeBanco.Q3.Conta.sacar(Conta.java:62)
	at atividadeBanco.Q3.TestaConta.main(TestaConta.java:10)

    *java.lang.Error: Saldo insuficiente*

 */
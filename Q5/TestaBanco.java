package atividadeBanco.Q5;

import atividadeBanco.Banco;
import atividadeBanco.Conta;

public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.inserir(new Conta("1111-1", "Rapunzel da Silva", 10));
        banco.inserir(new Conta("2222-2", "Jaspion Sousa", 30));
        banco.inserir(new Conta("3333-3","Raimundo Kakashi",65));

        banco.transferir("1111-1", "2222-2", 700);
    }
}

/*
    Exception in thread "main" java.lang.Error: Saldo insuficiente
	at atividadeBanco.Q5.Conta.sacar(Conta.java:62)
	at atividadeBanco.Q5.Conta.transferir(Conta.java:93)
	at atividadeBanco.Banco.transferir(Banco.java:106)
	at atividadeBanco.Q5.TestaBanco.main(TestaBanco.java:14)

   Os métodos no final executam conta.transferir(), que, ao lançar uma exceção não tratada, encerra o programa.
   A exceção ocorre na classe Conta e é "propagada", manifestando-se nos métodos que a chamam.
   A implementação é confiável, pois permite o tratamento da exceção no script do aplicativo, não impedindo sua manipulação.
 */
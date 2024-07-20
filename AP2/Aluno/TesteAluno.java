package Pratica01.Aluno;

public class TesteAluno {
    public static void main (String arg[]){

Aluno a1, a2;
a1 = new Aluno();
a2= new Aluno();
a1.setNome("Fulano");
a2.setNome("ciclano");
System.out.println("Aluno1: " + a1.getNome());

System.out.println ("Aluno2: " + a2.getNome());
}
}


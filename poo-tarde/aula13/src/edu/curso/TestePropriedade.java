package edu.curso;

public class TestePropriedade {
    public static void main(String[] args) {
        Secretaria s1 = new Secretaria();
        CentralEstagio c1 = new CentralEstagio();
        c1.setAluno( s1.getAluno() );
        // System.out.println(s1.getAluno().getNome());
        s1.getAluno().setNome("José Silva");
        // System.out.println(s1.getAluno().getNome());

        s1.getAluno().setNome("João Silva");
    }
}

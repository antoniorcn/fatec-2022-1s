package edu.curso;

public class TesteAluno {

    public static void criarAlunos1() {
        System.out.println("Dados de alunos");
        Aluno a1 = new Aluno();
        a1.setId(1);
        a1.setRa("11111");
        a1.setNome("João Silva");

        Aluno a2 = new Aluno();
        a2.setId(2);
        a2.setRa("22222");
        a2.setNome("Maria Silva");

        System.out.println("A1 ==> " + a1);
        System.out.println("A2 ==> " + a2);
    }

    public static void criarAlunos2() {
        GestaoAlunos gestao = new GestaoAlunos();
        gestao.criar();
        gestao.criar();
    }

    public static void main(String[] args) {
        criarAlunos2();
    }
}

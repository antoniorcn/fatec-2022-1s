package edu.curso;

import java.time.LocalDate;

public class TesteAluno {
    public static void criarAluno1() {
        Aluno a = new Aluno();
        a.setId(1);
        a.setRa("11111");
        a.setNome("João Silva");
        a.setNascimento(
                LocalDate.of(2000, 06, 30));

        System.out.println("Aluno ==> " + a);
    }

    public static void criarAluno2() {
        GestaoAlunos gestaoAlunos = new GestaoAlunos();
        gestaoAlunos.criar();
        gestaoAlunos.criar();
        gestaoAlunos.listarAlunos();
    }


    public static void main(String[] args) {
        criarAluno2();
    }
}

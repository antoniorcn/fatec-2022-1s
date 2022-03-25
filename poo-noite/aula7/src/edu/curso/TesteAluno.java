package edu.curso;

import java.time.LocalDate;

public class TesteAluno {
    public static void criarAluno1() {
        AlunoFatec a = new AlunoFatec();
        a.setId(1);
        a.setRa("11111");
        a.setNome("João Silva");
        a.setNascimento(
                LocalDate.of(2000, 06, 30));

        System.out.println("AlunoFatec ==> " + a);
    }

    public static void criarAluno2() {
        GestaoAlunos gestaoAlunos = new GestaoAlunos();
        gestaoAlunos.menu();
    }


    public static void main(String[] args) {
        criarAluno2();
    }
}

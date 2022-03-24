package edu.curso;

import com.sun.javafx.binding.StringFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestaoAlunos {

    private int indice = 0;
    private Aluno[] alunos = new Aluno[1000];
    private Scanner input = new Scanner(System.in);

    public void criar() {
        System.out.println("Criar novo aluno");
        System.out.println("Digite o RA do novo aluno: ");
        String ra = input.nextLine();
        System.out.println("Digite o NOME do novo aluno: ");
        String nome = input.nextLine();
        System.out.println("Digite a data de NASCIMENTO do novo aluno:");
        String nascimento = input.nextLine();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(nascimento, formatter);

        Aluno a = new Aluno();
        a.setId( this.indice );
        a.setRa( ra );
        a.setNome( nome );
        a.setNascimento( dataNascimento );

        alunos[ indice ] = a;
        indice++;
        System.out.println("Aluno foi criado com sucesso");
    }

    public void atualizar() {
        System.out.println("Atualização de alunos");
        System.out.println("Por favor informe o RA do aluno a ser atualizado");
        String ra = input.nextLine();


        // Escrever codigo para procurar o aluno pelo RA dentro do vetor
    }

}

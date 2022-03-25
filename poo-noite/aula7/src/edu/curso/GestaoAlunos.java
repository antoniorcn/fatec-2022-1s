package edu.curso;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class GestaoAlunos {
    private int indice;
    private Aluno[] alunos = new Aluno[1000];
    private Scanner input = new Scanner(System.in);
    private DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("d/MM/yyyy");

    public void criar() {
        System.out.println("Criação de Aluno");
        Aluno a = new Aluno();
        System.out.println("Informe o RA do novo aluno");
        a.setRa(input.nextLine());
        System.out.println("Informe o NOME do novo aluno");
        a.setNome(input.nextLine());
        System.out.println("Informe o NASCIMENTO do novo aluno");
        String nascimento = input.nextLine();
        LocalDate data = LocalDate.parse(nascimento, formatter);
        a.setNascimento(data);
        this.alunos[this.indice] = a;
        this.indice++;
        System.out.println("Aluno foi criado com sucesso");
    }

    public void mostrarAluno() {
        System.out.println("Mostrar dados do Aluno");
        System.out.println("Por favor digite o RA do aluno a ser mostrado");
        String ra = input.nextLine();

        // Pesquise no vetor alunos o primeiro aluno que estiver com
        // este RA informado pelo usuário e mostre os dados na tela.
        for (Aluno a : this.alunos) {
            if (a != null && a.getRa().equals(ra)) {
                System.out.println("Dados do Aluno");
                System.out.println("ID: " + a.getId());
                System.out.println("RA: " + a.getRa());
                System.out.println("NOME: " + a.getNome());
                System.out.println("NASCIMENTO: " + a.getNascimento());
            }
        }
    }

    public void listarAlunos() {
        for(Aluno a : this.alunos) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }

    public void atualizar() {
        System.out.println("Atualizar dados do Aluno");
        System.out.println("Por favor digite o RA do aluno a ser atualizado");
        String ra = input.nextLine();
        for (Aluno a : this.alunos) {
            if (a != null && a.getRa().equals(ra)) {
                System.out.println("Informe o novo NOME do aluno");
                a.setNome(input.nextLine());
                System.out.println("Informe o novo NASCIMENTO do aluno");
                String nascimento = input.nextLine();
                LocalDate data = LocalDate.parse(nascimento, formatter);
                a.setNascimento(data);
                System.out.println("Aluno atualizado com sucesso");
                break;
            }
        }
    }

    public int getIndice() {
        return indice;
    }
    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}

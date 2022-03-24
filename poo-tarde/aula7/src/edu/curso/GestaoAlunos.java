package edu.curso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestaoAlunos {

    private int indice = 0;
    private Aluno[] alunos = new Aluno[1000];
    private Scanner input = new Scanner(System.in);
    private DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("d/MM/yyyy");

    public void criar() {
        System.out.println("Criar novo aluno");
        System.out.println("Digite o RA do novo aluno: ");
        String ra = input.nextLine();
        System.out.println("Digite o NOME do novo aluno: ");
        String nome = input.nextLine();
        System.out.println("Digite a data de NASCIMENTO do novo aluno:");
        String nascimento = input.nextLine();

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

        Aluno alunoEncontrado = null;
        for (Aluno a : this.alunos) {
            if (a != null && a.getRa().equals(ra)) {
                alunoEncontrado = a;
            }
        }
        System.out.println("Digite o novo NOME do aluno: ");
        alunoEncontrado.setNome(input.nextLine());
        System.out.println("Digite a nova data de NASCIMENTO do aluno:");
        String nascimento = input.nextLine();
        LocalDate dataNascimento = LocalDate.parse(nascimento, formatter);
        alunoEncontrado.setNascimento(dataNascimento);
    }

    public void excluir() {
        System.out.println("Exclusão de alunos");
        System.out.println("Por favor informe o RA do aluno a ser excluído");
        String ra = input.nextLine();
        int indiceExclusao = -1;
        for (int i = 0; i < alunos.length; i++) {
            Aluno a = alunos[i];
            if (a != null && a.getRa().equals(ra)) {
                indiceExclusao = i;
            }
        }
        if (indiceExclusao != -1) {
            alunos[indiceExclusao] = null;
            System.out.println("Aluno excluído com sucesso");
        } else {
            System.out.println("Aluno não encontrado");
        }
    }

    public void mostrar() {
        System.out.println("Visualização de alunos");
        System.out.println("Por favor informe o RA do aluno a ser visualizado");
        String ra = input.nextLine();

        Aluno alunoEncontrado = null;
        for (Aluno a : this.alunos) {
            if (a != null && a.getRa().equals(ra)) {
                alunoEncontrado = a;
            }
        }
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado");
            System.out.println("ID: " + alunoEncontrado.getId());
            System.out.println("RA: " + alunoEncontrado.getRa());
            System.out.println("NOME: " + alunoEncontrado.getNome());
            System.out.println("NASCIMENTO: " + alunoEncontrado.getNascimento());
        } else {
            System.out.println("Aluno não foi encontrado");
        }
    }

    public void listarAlunos() {
        System.out.println("Listagem de alunos");

        for (Aluno a : this.alunos) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }

    public void menu() {
        boolean sair = false;
        while(!sair) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("(C)riar\t\t(E)xibir\t\t(R)emover");
            System.out.println("(A)tualizar\t\t(L)istar\t\t(S)air");

            String textoMaiusculo = input.nextLine().toUpperCase();
            char letra = textoMaiusculo.charAt(0);

            if (letra == 'C') {
                this.criar();
            } else if (letra == 'E') {
                this.mostrar();
            } else if (letra == 'R') {
                this.excluir();
            } else if (letra == 'A') {
                this.atualizar();
            } else if (letra == 'L') {
                this.listarAlunos();
            } else if (letra == 'S') {
                sair = true;
            } else {
                System.out.println("Opção (" + letra + ") inválida");
            }
        }
    }

}

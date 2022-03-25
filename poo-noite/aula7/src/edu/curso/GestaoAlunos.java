package edu.curso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestaoAlunos {
    private int indice;
    private AlunoFatec[] alunos = new AlunoFatec[1000];
    private Scanner input = new Scanner(System.in);
    private DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("d/MM/yyyy");

    public void criar() {
        System.out.println("Criação de AlunoFatec");
        AlunoFatec a = new AlunoFatec();
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
        System.out.println("AlunoFatec foi criado com sucesso");
    }

    public void mostrarAluno() {
        System.out.println("Mostrar dados do AlunoFatec");
        System.out.println("Por favor digite o RA do aluno a ser mostrado");
        String ra = input.nextLine();

        // Pesquise no vetor alunos o primeiro aluno que estiver com
        // este RA informado pelo usuário e mostre os dados na tela.
        for (AlunoFatec a : this.alunos) {
            if (a != null && a.getRa().equals(ra)) {
                System.out.println("Dados do AlunoFatec");
                System.out.println("ID: " + a.getId());
                System.out.println("RA: " + a.getRa());
                System.out.println("NOME: " + a.getNome());
                System.out.println("NASCIMENTO: " + a.getNascimento());
            }
        }
    }

    public void listarAlunos() {
        for(AlunoFatec a : this.alunos) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }

    public void atualizar() {
        System.out.println("Atualizar dados do AlunoFatec");
        System.out.println("Por favor digite o RA do aluno a ser atualizado");
        String ra = input.nextLine();
        for (AlunoFatec a : this.alunos) {
            if (a != null && a.getRa().equals(ra)) {
                System.out.println("Informe o novo NOME do aluno");
                a.setNome(input.nextLine());
                System.out.println("Informe o novo NASCIMENTO do aluno");
                String nascimento = input.nextLine();
                LocalDate data = LocalDate.parse(nascimento, formatter);
                a.setNascimento(data);
                System.out.println("AlunoFatec atualizado com sucesso");
                break;
            }
        }
    }

    public void excluir() {
        System.out.println("Excluir AlunoFatec");
        System.out.println("Por favor digite o RA do aluno a ser excluido");
        String ra = input.nextLine();
        for (int i = 0; i < this.alunos.length; i++) {
            AlunoFatec a = this.alunos[i];
            if (a != null && a.getRa().equals(ra)) {
                this.alunos[i] = null;
                System.out.println("AlunoFatec excluído com sucesso");
                break;
            }
        }
    }

    public void menu() {
        boolean sair = false;
        while(!sair) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("Opções: ");
            System.out.println("(C)riar\t\t(E)xibir\t\t(R)emover");
            System.out.println("(A)tualizar\t\t(L)istar\t\t(S)air");

            String textoMaiusculo = input.nextLine().toUpperCase();
            char letra = textoMaiusculo.charAt(0);

            if (letra == 'C') {
                criar();
            } else if (letra == 'E') {
                mostrarAluno();
            } else if (letra == 'R') {
                excluir();
            } else if (letra == 'A') {
                atualizar();
            } else if (letra == 'L') {
                listarAlunos();
            } else if (letra == 'S') {
                sair = true;
            } else {
                System.out.println("Opção (" + letra + ") inválida");
            }
        }
    }

    public int getIndice() {
        return indice;
    }
    public void setIndice(int indice) {
        this.indice = indice;
    }

    public AlunoFatec[] getAlunos() {
        return alunos;
    }
    public void setAlunos(AlunoFatec[] alunos) {
        this.alunos = alunos;
    }
}

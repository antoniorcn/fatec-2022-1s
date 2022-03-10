package edu.curso;

import java.util.Scanner;

public class Teste {
    public static void imprimirDados(Dinossauro dino) {
        System.out.println("Status do Dinossauro Skeep");
        System.out.println("Energia " + dino.getEnergia());
        System.out.println("Velocidade " + dino.getVelocidade());
        System.out.printf("Temperatura %d \n", dino.getTemperatura());
        System.out.printf("Humor %d \n", dino.getHumor());
    }

    public static void main(String[] args) {
        Dinossauro skeep = new Dinossauro();

        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        while (!sair) {

            imprimirDados(skeep);

            System.out.println("Escolha qual opção deseja: ");
            System.out.println("(P)ular\t(C)orrer\tCo(M)er");
            System.out.println("C(A)ntar/\tTomar (S)ol\tFicar na S(O)mbra   (X)Sair");

            String opcao = scan.nextLine();

            if ("P".equalsIgnoreCase(opcao)) {
                skeep.pular();
            }

            if ("X".equalsIgnoreCase(opcao)) {
                sair = true;
            }
        }
    }
}

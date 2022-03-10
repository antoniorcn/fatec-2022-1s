package edu.curso;

public class TesteDeNull {
    public static void main(String[] args) {
        System.out.println("Teste de Null");

        String texto = "ABC";

        texto = null;

        if ("ABC".equals(texto)) {
            System.out.println("São iguais");
        }
    }
}

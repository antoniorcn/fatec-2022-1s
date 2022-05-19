package edu.curso;

public class Escola {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("João Silva");
        a1.setEmail("joao_silva@hotmail.com");

        Secretaria s1 = new Secretaria();

        a1.emailProperty().addListener(s1);

        a1.setEmail("joao_silva@gmail.com");
        a1.setEmail("joao_silva@globo.com");
        a1.setEmail("joao_silva@yahoo.com");
    }
}

package edu.curso;

public class CentralEstagio {

    private Aluno aluno;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
        aluno.nomeProperty().addListener(
                (prop, nomeAntigo, nomeNovo) -> {
                    System.out.println("A central de estagio ficou sabendo que houve alteração no nome do aluno");
                });
    }
}

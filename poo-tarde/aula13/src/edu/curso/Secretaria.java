package edu.curso;

public class Secretaria {

    private Aluno aluno = new Aluno();

    public Secretaria() {
        aluno.nomeProperty().addListener(
                (prop, nomeAntigo, novoNome) -> {
                    this.nomeAlterado(novoNome);
                });
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void nomeAlterado(String novoNome) {
        System.out.println("O nome do aluno foi alterado para "
                + novoNome );
    }
}

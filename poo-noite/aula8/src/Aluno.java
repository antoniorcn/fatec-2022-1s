public class Aluno {
    public String ra;
    public String nome;
    public static void estudar() {
        System.out.println("Estudando ...");
    }
    public void fazerMatricula() {
        System.out.println("Fazendo matricula do " + nome);
    }
    public static void main(String[] args) {
        Aluno.estudar();

        Aluno a1 = new Aluno();
        a1.ra = "111111";
        a1.nome = "22222";
        a1.fazerMatricula();
        a1.estudar();
    }
}

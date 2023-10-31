abstract class Funcionario {

    protected String nome;
    protected int id;
    protected double salario;

    protected Funcionario(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }


    public String getnome() {
        return nome;

    }

    public abstract double calcularSalario();
}

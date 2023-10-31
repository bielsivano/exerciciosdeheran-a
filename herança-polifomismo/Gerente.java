public class Gerente extends Funcionario{

    protected double bonus;
    protected Gerente(String nome, int id, double salario,double bonus) {
        super(nome, id, salario);
        this.bonus = bonus;
    }


    @Override
    public double calcularSalario() {
        return salario + bonus;
    }
}


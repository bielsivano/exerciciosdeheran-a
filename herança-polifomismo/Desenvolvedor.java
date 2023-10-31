public class Desenvolvedor extends Funcionario {

    protected int Numdeprojetos;
    protected Desenvolvedor(String nome, int id, double salario,int numdeprojetos) {
        super(nome, id, salario);
        this.Numdeprojetos = numdeprojetos;
    }
    @Override
    public double calcularSalario(){
        return salario * Numdeprojetos/2;
    }
}

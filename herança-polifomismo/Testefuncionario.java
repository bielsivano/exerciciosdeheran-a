import java.util.ArrayList;
import java.util.List;

public class Testefuncionario {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Felipe", 1, 7000, 2000));
        funcionarios.add(new Desenvolvedor("Gabriel", 2, 5000, 5));
        funcionarios.add(new Gerente("Yan", 3, 8000, 3200));
        funcionarios.add(new Desenvolvedor("Glauber", 4, 5500, 3));

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getnome());
            System.out.println("Salário: " + funcionario.calcularSalario());
        }
    }
}


import javax.swing.*;

public class pessoafisica extends pessoa{
    private String cpf;

    public  pessoafisica(String _nome, String telefone, String endereco, String cpf){
        super(_nome, telefone, endereco);
        this.cpf = cpf;

    }
    public void exibir_dados(){
        JOptionPane.showMessageDialog(null, "O nome é "+ nome);
        JOptionPane.showMessageDialog(null, "O telefone é "+ telefone);
        JOptionPane.showMessageDialog(null, "O endereço é "+ endereco);
        JOptionPane.showMessageDialog(null, "O CPF é "+ cpf);

    }
}

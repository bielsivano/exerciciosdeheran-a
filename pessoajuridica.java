import javax.swing.*;

public class pessoajuridica extends pessoafisica{
public String cnpj;
    public pessoajuridica(String _nome, String telefone, String endereco, String cpf, String cnpj) {
        super(_nome, telefone, endereco, cpf);
        this.cnpj = cnpj;
    }
    public void exibir_dados(){
        JOptionPane.showMessageDialog(null, "O nome é "+ nome);
        JOptionPane.showMessageDialog(null, "O telefone é "+ telefone);
        JOptionPane.showMessageDialog(null, "O endereço é "+ endereco);
        JOptionPane.showMessageDialog(null, "O CPF é "+ cnpj);

    }
}

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        pessoa ps = new pessoa("Victor", "19971303025", "Rua itanhaem");
        pessoafisica pf = new pessoafisica("Beraldo", "5454545454","Rua eu mesmo", "2235656963");
        pessoajuridica pj = new pessoajuridica("Calleri", "454545454", "Murumbi", "445448648", "41545454");

        pf.exibir_dados();
        pj.exibir_dados();

    }
}
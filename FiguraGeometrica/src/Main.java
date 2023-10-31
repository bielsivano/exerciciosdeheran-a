import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        retangulo ret = new retangulo(0.1 ,0.2);
        triangulo tri = new triangulo(0.1, 0.2);
        trapezio tra = new trapezio(0.2, 0.3, 0.4);

        ret.base=Double.valueOf(JOptionPane.showInputDialog(null, "Digite a base do retangulo"));
        ret.altura = Double.valueOf((JOptionPane.showInputDialog(null, "Digite a altura do retangulo ")));

        tri.base=Double.valueOf(JOptionPane.showInputDialog(null, "Digite a base do triangulo "));
        tri.altura = Double.valueOf((JOptionPane.showInputDialog(null, "Digite a altura do triangulo ")));

        tra.base=Double.valueOf(JOptionPane.showInputDialog(null, "Digite a base do trapezio "));
        tra.altura = Double.valueOf((JOptionPane.showInputDialog(null, "Digite a altura do trapezio ")));
        tra.baseM = Double.valueOf((JOptionPane.showInputDialog("Digite a base maior do trapezio")));

        ret.calculaArea(ret.base, ret.altura);
        tri.calcula_area(tri.base, tri.altura);
        tra.calculaArea(tra.baseM, tra.base, tra.altura);
    }
}
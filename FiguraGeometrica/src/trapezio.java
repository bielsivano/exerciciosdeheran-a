import javax.swing.*;

public class trapezio extends figuraGeometrica{

    public double baseM;


    public trapezio(Double base, Double altura, Double baseM) {
        super(base, altura);
        this.baseM = baseM;

    }
    public void calculaArea (double baseM, double base, double altura){
        JOptionPane.showMessageDialog(null, "A area do trapezio é "+ (baseM + base) * altura / 2 );
    }
}

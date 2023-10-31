import javax.swing.*;

public class retangulo extends  figuraGeometrica{
    public retangulo(Double base, Double altura) {
        super(base, altura);
    }
    public void calculaArea(double altura, double base){
    JOptionPane.showMessageDialog(null, "A area do retangulo é "+ base * altura);
}
}

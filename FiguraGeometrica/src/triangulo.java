import javax.swing.*;

public class triangulo extends figuraGeometrica{

    public triangulo(Double base, Double altura) {
        super(base, altura);
    }
    public void calcula_area(Double base, Double altura)
    {
        JOptionPane.showMessageDialog(null,"Areá é do triangulo é "+ (base * altura) / 2);
    }

}
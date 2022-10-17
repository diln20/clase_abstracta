
package claabstractas;

/**
 *
 * @author dilan
 */
public class Circulo extends Forma{
    
    private double radio;
    public Circulo() {
    }

    public Circulo(double radio, int posx, int posy) {
        super(posx, posy);
        this.radio = radio;
    }

    

    @Override
    public double calArea() {
     double resultado=radio*3.1416;
     return resultado;
    }
    
    
}

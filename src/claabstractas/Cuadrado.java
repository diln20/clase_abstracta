
package claabstractas;

/**
 *
 * @author dilan
 */
public class Cuadrado extends Forma {

    private double lado;
    public Cuadrado() {
    }

    public Cuadrado(double lado, int posx, int posy) {
        super(posx, posy);
        this.lado = lado;
    }

    @Override
    public double calArea() {
       double resultado=lado*lado;
       return resultado;
    }
    
}

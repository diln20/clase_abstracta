
package claabstractas;

/**
 *
 * @author dilan
 */
public abstract class  Forma {
    protected double posx;
    protected double posy;

    protected  Forma() {
    }

    protected Forma(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }

    public double getPosx() {
        return posx;
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public double getPosy() {
        return posy;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }
    
    public abstract double calArea();
    
    
}

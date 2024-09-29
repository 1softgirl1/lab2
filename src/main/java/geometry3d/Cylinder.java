package geometry3d;
import exceptions.CylinderException;
import geometry2d.*;


public class Cylinder {
    private Circle c;
    private double h;

    public Cylinder(Circle c, double h) {
        try{
            if(h<0) throw new CylinderException("Недопустимое значение, высота меньше 0");
            this.c = c;
            this.h = h;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public double volume(){
        return Math.round(h*c.area());
    }
}

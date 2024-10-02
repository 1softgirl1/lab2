package geometry3d;
import exceptions.CylinderException;
import geometry2d.*;


public class Cylinder {
    private Figure f;
    private double h;

    public Cylinder(Figure f, double h) {
        try{
            if(h<0) throw new Exception("Недопустимое значение, высота меньше 0");
            this.f = f;
            this.h = h;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public double volume(){
        return Math.round(h*f.area());
    }
}

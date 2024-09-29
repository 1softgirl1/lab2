package geometry2d;

import exceptions.*;

public class Circle implements Figure{
    private int radius;
    public Circle(int r) {
        try{
            if(r<0) throw new CircleException("Недопустимое значение, радиус меньше 0");
            this.radius=r;
        }catch (CircleException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public int area(){
        return (int) Math.round(Math.PI*radius*radius);
    }
    public String toString() {
        return "Круг с радиусом: " + radius;
    }
}

package geometry2d;

import exceptions.RectangleException;

public class Rectangle implements Figure{
    private int a,b;
    public Rectangle(int a, int b){
        try{
            if (a<=0 || b<=0) throw new RectangleException("Недопустимое значение, сторона меньше 0");
            this.a=a;
            this.b=b;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public int area(){
        return a*b;
    }

    public String toString() {
        return "Прямоугольник со сторонами: " + a+" ,"+ b;
    }
}
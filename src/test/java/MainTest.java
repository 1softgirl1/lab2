import geometry2d.Circle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import geometry2d.*;
import geometry3d.*;
import exceptions.*;

class MainTest {
    @Test
    void Balance() {
        Balance b1= new Balance();
        b1.addRight(5);
        assertEquals('R',b1.result());
        b1.addLeft(6);
        assertEquals('L',b1.result());
        b1.addRight(1);
        assertEquals('=',b1.result());
    }

    @Test
    void Separator(){
        OddEvenSeparator a1=new OddEvenSeparator();
        List<Integer> expectedOdd = new ArrayList<>();
        List<Integer> expectedEven = new ArrayList<>();

        a1.addNumbers(1);
        a1.addNumbers(2);
        a1.addNumbers(3);
        a1.addNumbers(4);
        a1.addNumbers(5);

        expectedOdd.add(1);
        expectedOdd.add(3);
        expectedOdd.add(5);

        expectedEven.add(2);
        expectedEven.add(4);

        assertEquals(expectedOdd, a1.odd());
        assertEquals(expectedEven, a1.even());
    }

    @Test
    void Table(){
        int[][] c={{1,1,1},{2,2,2},{3,3,3}};

        Table t= new Table(3,3,c);
        t.printTable();

        assertEquals(1,t.getValue(0,0));
        assertEquals(3,t.getValue(2,2));

        t.setValue(0,0,77);
        assertEquals(77,t.getValue(0,0));

        assertEquals(3,t.rows());
        assertEquals(3,t.cols());

        assertEquals("7711222333",t.toString());
        assertEquals(10.0,t.average());
    }

    @Test
    void Figure(){
        Circle c=new Circle(5);
        Rectangle r=new Rectangle(4,6);
        assertEquals(79,c.area());
        assertEquals(24,r.area());
    }
    @Test
    void Cylinder(){
        Circle c=new Circle(5);
        Cylinder c1=new Cylinder(c,44);
        assertEquals(3476,c1.volume());

        Rectangle r=new Rectangle(4,6);
        Cylinder c2=new Cylinder(r,44);
        assertEquals(1056,c2.volume());
    }
}

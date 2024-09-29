import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        Button b=new Button();
        b.click();
        b.click();
        b.click();
        b.click();

        /*Bell bell = new Bell();
        while(true) {
            bell.sound();
        }*/

    }
}

//Задание 1
class Button
{
    private static int count=0;
    public void click() {
        count++;
        System.out.println("Кнопка нажата " + count + " раз");
    }
}
//Задание 2
class Bell
{
    private String lastSound="ding";
    public void sound()
    {
        if (lastSound.equals("ding")) {
            lastSound = "dong";
        } else {
            lastSound = "ding";
        }
        System.out.println(lastSound);
    }
}

//Задание 3
class Balance
{
    private int leftWeight;
    private int rightWeight;

    public Balance() {
        this.leftWeight = 0;
        this.rightWeight = 0;
    }

    public void addRight(int weight) {
        try{
            if(weight<0) throw new Exception("Недопустимое значение, вес меньше 0");
            this.rightWeight += weight;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void addLeft(int weight) {
        try{
            if(weight<0) throw new Exception("Недопустимое значение, вес меньше 0");
        this.leftWeight += weight;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public char result(){
        if(rightWeight==leftWeight)
        {
            return '=';
        }
        if(rightWeight>leftWeight)
        {
            return 'R';
        }
        else
        {
            return 'L';
        }
    }

}

//Задание 4
class OddEvenSeparator{
    public List<Integer> oddNumbers = new ArrayList<Integer>();
    public List<Integer> evenNumbers = new ArrayList<Integer>();

    public void addNumbers(int a){
        if(abs(a)%2==0){
            evenNumbers.add(a);
        }
        else{
            oddNumbers.add(a);
        }
    }

    public List<Integer> even() {
        return new ArrayList<>(evenNumbers);
    }

    public List<Integer> odd() {
        return new ArrayList<>(oddNumbers);
    }

    public void printOdd (){
        for (Integer oddNumber : oddNumbers) {
            System.out.println(oddNumber);
        }
    }
    public void printEven (){
        for (Integer evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }
    }
}

class Table{
    private int rows, cols;
    private int[][] t;

    public Table(int rows, int cols){
        this.rows=rows;
        this.cols=cols;
        t =new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols;j++){
                t[i][j]=0;
            }
        }
    }

    public Table(int rows, int cols,int[][] t ){
        this.rows=rows;
        this.cols=cols;
        this.t=t;
    }

    public void printTable(){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols;j++){
                System.out.print(t[i][j]);
                System.out.print(' ');
            }
            System.out.println(' ');
        }
    }



    public int getValue(int row, int col) {
        try{
            if (row >= rows || row < 0 || col >= cols || col < 0) throw new Exception("Недопустимое значение");

            return t[row][col];

        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public int[][] setValue(int row, int col, int value){
        try{
            if (row >= rows || row < 0 || col >= cols || col < 0) throw new Exception("Недопустимое значение");
            t[row][col]=value;
            return t;
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return this.t;
    }


    public int rows() {
        return rows;
    }
    public int cols() {
        return cols;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();

        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                str.append(Integer.toString(t[i][j]));
            }
        }
        return String.valueOf(str);
    }

    public double average(){
        int sum=0;
        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                sum+=t[i][j];
            }
        }
        return Math.round((double) sum /(rows*cols));
    }
}





import java.util.Scanner;

abstract class shape{
    int l,b;
    public void printArea(){}
}
class rectangle extends shape{
    Scanner sc=new Scanner(System.in);
       public void printArea(){
        System.out.println("enter length and breadth:");
        int l=sc.nextInt();
        int b=sc.nextInt();
       System.out.println("area of rectangle="+l*b);
    }

}
class triangle extends shape{
    Scanner sc=new Scanner(System.in);
       public void printArea(){
        System.out.println("enter base and height:");
        int b=sc.nextInt();
        int h=sc.nextInt();
        System.out.println("area of triangle="+b*h*0.5);
    }
}
class circle extends shape{
    Scanner sc=new Scanner(System.in);
    public void printArea(){
        System.out.println("Enter circle radius:");
        int r=sc.nextInt();
        System.out.println("area of circle="+3.14*r*r);
    }
}

public class Experiment11_shape{
    public static void main(String args[]){
        shape obj=new rectangle();
        obj.printArea();;
        shape obj1=new triangle();
        obj1.printArea();
        shape obj2=new circle();
        obj2.printArea();
    }
}

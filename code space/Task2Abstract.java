import java.util.Scanner;
abstract class shape{
int length,breadth,radius;
Scanner sc=new Scanner(System.in);
abstract void printArea();
}
class Rectangle extends shape{
void printArea(){
System.out.println("Enter length: ");
length=sc.nextInt();
System.out.println("Enter breadth: ");
breadth=sc.nextInt();
int area=length*breadth;
System.out.println("Area of Rectangle="+area);
}
}
class Triangle extends shape{
void printArea(){
System.out.println("Enter base: ");
length=sc.nextInt();
System.out.println("Enter height: ");
breadth=sc.nextInt();
double area=0.5*length*breadth;
System.out.println("Area of Triangle="+area);
}
}
class circle extends shape{
void printArea(){
System.out.println("Enter radius: ");
radius=sc.nextInt();
double area=3.14*radius*radius;
System.out.println("Area of circle="+area);
}
}
class Task2Abstract{
public static void main(String[]args){
shape s;
s=new Rectangle();
s.printArea();
System.out.println();
s=new Triangle();
s.printArea();
System.out.println();
s=new circle();
s.printArea();
}
}

 

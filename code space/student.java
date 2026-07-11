public class student{
String name;
String rollno;
public static void main (String args[]){
student s1=new student();
s1.name="Nandini";
s1.rollno="G6";
student s2=new student();
s2.name="spoorthi";
s2.rollno="H5";
s1.display();
s2.display();
}
void display(){
System.out.println(name);
System.out.println(rollno);
}

}
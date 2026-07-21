class studentEx{
String name;
String rollno;
public studentEx(){
System.out.println("I am default constructor");
}
public studentEx(String name,String rollno){
this.name=name;
this.rollno=rollno;
}
public static void main(String args[]){
StudentEx s1=newstudentEx("Nandini","G6");
StudentEx s2=newstudentEx("Praveena","H0");
StudentEx s3=newstudentEx("Spoorthi","H5");
StudentEx s4=new studentEx();
student.out.println(s1.name);
student.out.println(s1.rollno);
student.out.println(s2.name);
student.out.println(s2.rollno);
}
}
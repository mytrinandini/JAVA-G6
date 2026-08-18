final class student{
final String rollno;
final String name;
final String grade;
int marks;
student(String rollno,String name,String grade,int marks){
this.rollno=rollno;
this.name=name;
this.marks=marks;
this.grade=grade;
}
final String grading(){
if (marks>=90)return "O";
else if(marks>=80)return "A+";
else if(marks>=70)return "A";
else if(marks>=60)return "B+";
else if(marks>=50)return "B";
else if(marks>=40)return "C";
else return "F";
}
void show(){
System.out.println("rollno:"+rollno);
System.out.println("name:"+name);
System.out.println("grade:"+grade);
System.out.println("marks:"+marks);
}
class finalEx{
public static void main(String args[]){
student s1=new student("G6","M.Sai Nandini","A+",85);
s1.show();
}
}
}


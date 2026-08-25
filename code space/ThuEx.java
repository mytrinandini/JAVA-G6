interface sportsPerson{
void playSports();
}
interface NSSVolunteer{
void doSocialWork();
}
class Student implements sportsPerson,NSSVolunteer{
String name;
Student(String name){
this.name=name;
}
public void playSports(){
System.out.println(name +" is at play ground");
}
public void doSocialWork(){
System.out.println(name +" is at blood donation camp");
}
}
class ThuEx{
public static void main(String args[]){
Student S1=new Student("Nandini");
S1.playSports();
S1.doSocialWork();
}
}

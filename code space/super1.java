class A{
int i=10;
A(){}
A(int i){
this.i=i;
System.out.println("parent class i="+i);
}
}
class B extends A{
int i=20;
B(int i){
super(i);
System.out.println("child class i="+this.i);
System.out.println("child class i="+super.i);
}
}
class super1{
public static void main(String args[]){
B obj=new B(40);
}
}
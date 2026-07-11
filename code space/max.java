class max{
public static void main(String args[]){
int[] myArray={43,78,23,46,90,124,564,76,456};
int max=myArray[0];
for(int i=1;i<myArray.length;i++){
if(myArray[i]>max){
max=myArray[i];
}
}
System.out.println(max);
}
}
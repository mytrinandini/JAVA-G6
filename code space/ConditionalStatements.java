public class ConditionalStatements {
public static void main(String[] args) {
int age = 20;
if (age >= 18) {
System.out.println(" You are eligible to vote.");
}
int number = 10;
if (number % 2 == 0) {
            System.out.println(" Number is even.");
        } else {
            System.out.println(" Number is odd.");
        }

               int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 75) {
            System.out.println(" Grade A");
        } else if (marks >= 60) {
            System.out.println(" Grade B");
        } else if (marks >= 50) {
            System.out.println(" Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
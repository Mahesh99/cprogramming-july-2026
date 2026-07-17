import java.util.Scanner;

public class ConstrolStatement {
    public static void main(String[] args) {
        // int battery=20;
        // if(battery<=20){
        //     System.out.println("Battery is low.\n");
        //     System.out.println("Please connect charger");
        // }


        // int n;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value of n:");
        // n=sc.nextInt();
        // if(n%2==0)
        //     System.out.print("Even");
        // else
        //     System.out.print("Odd");


        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        marks=sc.nextInt();
        //56
        if(marks>=90) {
            System.out.print("A grade");
        } else if (marks>=80) {
            System.out.print("B grade");
        } else if (marks>=70) {
            System.out.print("C grade");
        } else if(marks>=35) {
            System.out.print("Pass");
        } else {
            System.out.print("Fail");
        }

    }
}
//1
//1 0 1 0 1 0

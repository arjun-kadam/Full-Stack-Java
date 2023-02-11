import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        // Voting Age Check
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter You Age");
        age=sc.nextInt();
        if (age>=18) {
            System.out.println("You are Voter");
        }else{
            System.out.println("You are not Voter");
        }
    }
    
}

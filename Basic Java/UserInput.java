import java.util.*;
class UserInput{

    public static void main(String[] args) {
        int a,b;
        Scanner S= new Scanner(System.in);
        System.out.println("Enter a Number");
        a=S.nextInt();
        System.out.println("Enter Another Number");
        b=S.nextInt();
        System.out.println("Addition Will Be " +(a+b));
    }
}
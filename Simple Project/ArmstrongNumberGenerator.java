import java.util.*;
class NumberGenerator{
    public void ArmstrongChecker(int option){

        Random rdNum = new Random();
        int numb = rdNum.nextInt(100,999);
        int arm=0,remainder,check=numb;
        while (numb>0) { 
              remainder=numb%10;
              arm=arm+(int)Math.pow(remainder, 3);
              numb=numb/10;
        }
        if(check==arm && option==1){
            System.out.println("Here is Your Armstrong Number ==> " + check);
        }else if (check!=arm && option==1){
            ArmstrongChecker(option);        
        }else{
            System.out.println(check+" is non Armstrong Number");
        }
        
    }
}
public class ArmstrongNumberGenerator {
    public static void main(String[] args) {

        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Choice : \n1. Armstrong Number \n2. Non Armstrong Number");
        choice=scan.nextInt();
        NumberGenerator generator=new NumberGenerator();

        if (choice==1){
            generator.ArmstrongChecker(1);
        }else if (choice==2){
            generator.ArmstrongChecker(2);
        }else{
            System.out.println(" Enter Correct Option");
        }
    }
}

import java.util.*;
class NumberGenerator{
    public void ArmstrongChecker(int rdNum){

        int numb=rdNum,arm=0,remainder,check;
        check=numb;
        while (numb>0) { 
              remainder=numb%10;
              arm=arm+(int)Math.pow(remainder, 3);
              numb=numb/10;
        }
        if(check==arm){
            System.out.println(rdNum);
        }else{
            System.out.println(rdNum+"This is not");        
        }
        
    }
}
public class ArmstrongNumberGenerator {
    public static void main(String[] args) {

        int choice,random;
        Random r=new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Choice : \n1. Armstrong Number \n2. Non Armstrong Number");
        choice=scan.nextInt();
        NumberGenerator generator=new NumberGenerator();

        if (choice==1){
            generator.ArmstrongChecker(random=r.nextInt(100,999));
        }else{

        }
    }
}

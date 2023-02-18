public class Armstrong 
{
    public static void main(String[] args) 
    {
        int num=973,check=num,arm=0,reaminder;


        while(num>0){
        reaminder=num%10;
        arm=arm+ (int)Math.pow(reaminder, 3);
        num=num/10;
        }
        if(check==arm){
            System.out.println("Arm");

        }
        else{
            System.out.println("Not An Arm");
        }
    }
}
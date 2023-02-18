
public class ThisKeyword {

    int id;
    String Name;
    public void showDetails(int i, String n){
        this.id=i;
        this.Name=n;
        System.out.println("My ID is "+id +" and Name is "+Name);

    }
    public static void main(String[] args) {
        ThisKeyword p1=new ThisKeyword();
        p1.showDetails(0110, "Arjun");

    }
    
}

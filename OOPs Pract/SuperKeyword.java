class parentA{
    public void show() {
        System.out.println(" I am doing my work as a Parent");
    }
}

class ChildA extends parentA{
    public void show() {
        super.show();
        System.out.println("I am not doing any work :)");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        ChildA p1=new ChildA();
        p1.show();// It can call super method from parent class
    }
}

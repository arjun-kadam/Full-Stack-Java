class ParentClass{
    public void showOutput(){
        System.out.println("I am from Parent Class");
    }
}

/**
 * ChildClass
 */
 class ChildClass extends ParentClass{
    public void printOutput() {
        System.out.println("I am From Child class ");
        
    }    
}
public class SimpleInheritance {
    public static void main(String[] args) {
        ParentClass p1=new ParentClass();
        p1.showOutput();

    }
    
}

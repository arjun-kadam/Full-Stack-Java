// Classes and object in Java
class NewClasss {

    public void printName() {
        System.out.println("My name is NewClasss Method");
    }
}
public class ClassObj {

    public void writeSentence(){
        System.out.println("I am Writing Sentence");
    }
    public static void main(String[] args) {
         ClassObj obj1 = new ClassObj();
         obj1.writeSentence();
         NewClasss n1=new NewClasss();
         n1.printName();
    }
}

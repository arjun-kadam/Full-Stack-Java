public class SimpleConstructor {
    SimpleConstructor(){
        System.out.println(" I am default Constructor");

    }
    SimpleConstructor(String name){
        System.out.println("I am " + name);

    }
    public static void main(String[] args) {
        //SimpleConstructor s1 = new SimpleConstructor();
        SimpleConstructor s2 = new SimpleConstructor("Arjunn");
    }
}

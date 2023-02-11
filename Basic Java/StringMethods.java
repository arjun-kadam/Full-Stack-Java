public class StringMethods {
    public static void main(String[] args) {
        System.out.println("All String Methods");
        String name = new String(" Virtualization Of Machine");
        System.out.println("Length Of String ==>"+name.length());
        System.out.println("All Lower Case ==>"+name.toLowerCase());
        System.out.println("All Uppercase ==>"+name.toUpperCase());
        System.out.println("Trim Spaces ==>" + name.trim());
        System.out.println("Substring==>" + name.substring(6));
        System.out.println("SUbstring 2==> "+name.substring(4,10));
        System.out.println("Repalce ==> "+name.replace('a', 'b'));
        System.out.println("isStartwith _V ==> "+name.startsWith(" V"));
    }
    
}

public class MethodOverloading {

    // method 1
    public void playSong(){
        System.out.println("I am Playing Song");

    }
    public void playSong(int SongNumber){
        System.out.println(" I am Playing "+SongNumber+"th Song");
    }
    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        m1.playSong(17);
    }
    
}

public class Use_of_superKeyword {
    public static void main(String[] args) {
        Horse1 h=new Horse1();
        System.out.println(h.color);

    }
}
class Animal21{
    String color;
    Animal21(){
        System.out.println("Animal constructors is called");
    }

}
class Horse1 extends Animal21{

    Horse1(){
        super.color="Brown";
        System.out.println("Horse constructors is called");

    }

}

public class Abstraction_Class {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c=new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);


    }
}
abstract class Animals{
    String color;
     Animals(){
        color="Brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();

}
class Horse extends Animals{
    void changecolor(){
        color="white";
    }
    @Override
    void walk() {
        System.out.println("walk on 4 legs");

    }
}
class Chicken extends Animals{
    void change(){
        color="red";
    }
    @Override
    void walk() {
        System.out.println("walk on 2 legs");
    }
}

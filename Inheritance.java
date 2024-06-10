public class Inheritance {
    public static void main(String[] args) {
        Fish sc=new Fish();
        sc.eat();

    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathes(){
        System.out.println("Breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim in water");
    }

}
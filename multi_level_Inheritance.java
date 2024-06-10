public class multi_level_Inheritance {
    public static void main(String[] args) {
        Dog sc=new Dog();
        sc.eat();
        sc.legs=4;
        System.out.println(sc.legs);

    }
}
class Animal1{
    String color;
    void eat(){
        System.out.println("eats");
    }

}
class Mammals extends Animal1{
    int legs;
}
class Dog extends Mammals{
    int breed;
}
public class Method_Overriding {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eats();

    }
}
class Animal12{
    void eat(){
        System.out.println("Eats Anything");
    }

}
class Deer extends Animal{
    void eats(){
        System.out.println("Eats Grass");
    }
}

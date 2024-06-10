public class MutipleInheritance_using_Interface {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.use();


    }
}
// interface   Grandfather{
//    void properties();
//
//
//}
//interface father{
//    void properties1();
//
//class Son implements Grandfather,father{
//    @Override
//    public void properties() {
//        System.out.println("It properties is 100cr ");
//
//    }
//
//    @Override
//    public void properties1() {
//        System.out.println("It is properties 5cr");
//    }
//}
//
//
//}
interface Character {
    void attack();
}

interface Weapon {
    void use();
}

class Warrior implements Character, Weapon {
    public void attack() {
        System.out.println("Warrior attacks with a sword.");
    }

    public void use() {
        System.out.println("Warrior uses a sword.");
    }
}

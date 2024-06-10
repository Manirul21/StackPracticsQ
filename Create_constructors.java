public class Create_constructors {
    public static void main(String[] args) {
        student s= new student("Manirul");
        System.out.println(s.name);

    }

    static class student{
        String name;
        int roll;
        // create a constructors
        student(String name){
            this.name=name;
        }

    }
}

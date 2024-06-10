public class Keyword_static {
    public static void main(String[] args) {
        student s1=new student();
        s1.Schoolname="JVA";
        student s2=new student();
        //System.out.println(s2.Schoolname);
        student s3=new student();
        s3.Schoolname="Abc";
        System.out.println( s3.Schoolname);
        System.out.println(s2.Schoolname);
        s1.name="Manirul";
        System.out.println(s1.name);
        s1.roll=123;
        System.out.println(s1.roll);

    }
}
class student{
    String name;
    int roll;
    static String Schoolname;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    void setRoll(int roll){
        this.roll=roll;
    }
    int getRoll(){
        return this.roll;
    }
}

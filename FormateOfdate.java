public class FormateOfdate {
    public static String format(String str) {
        String part[] = str.split("-");
        String sub=part[0];
        String s=part[1];
        String str1=" ";
        for(int i=0;i<2;i++){
            str1+=sub.charAt(i);
        }
        String str2[]={"jan","feb","mar","april","may","jun","jul","agu","sept","oct","nov","dec"};
        int index=0;
        for(int i=0;i<str2.length;i++){
            if(str2[i].equals(s)){
                index=i+1;
            }
        }
        String manth=" ";
        if(index<=9){
            manth+="0"+index;
        }
        else {
            manth+=index;
        }
        //System.out.println(manth);
        String str3=part[2]+"-"+manth+"-"+str1;
        //System.out.println(str3);
        return str3;

    }

    public static void main(String[] args) {
        String str="09th-dec-2023";
        System.out.println( format(str));
    }
}

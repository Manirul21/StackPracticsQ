public class printDuplicayRecursion {
    public static void remove(String str,int index,StringBuilder newstr,boolean map[]){
        if(index==str.length()){
            System.out.print(newstr);
            return;
        }
        char currchar= str.charAt(index);
        if(map[currchar-'a']==true){
            remove(str,index+1,newstr,map);
        }
        else {
            map[currchar-'a']=true;
            remove(str,index+1,newstr.append(currchar),map);
        }
    }

    public static void main(String[] args) {
        String sc="appanncollege";
        remove(sc,0,new StringBuilder(""),new boolean[26]);
    }
}

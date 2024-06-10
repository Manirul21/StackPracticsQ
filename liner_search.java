public class liner_search {
    public static void main(String[] args) {
        int number[]={10,20,50,80,60};
        int key=50;
        int index=linersearch(number,key);
        if(index==-1){
            System.out.println("Not found element");
        }
        else {
            System.out.println("index of element "+index+"  value is :"+key);
        }
    }

    public static int linersearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;

    }
}

public class CalculateNumberOfdayInyear {
    public static void day(String str){
        String part[]= str.split("-");
        int year=Integer.valueOf(part[0]);
       // System.out.println(year);
        int month=Integer.valueOf(part[1]);
        int day1= Integer.valueOf(part[2]);
        int dayMonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        // if year is leper
        if(year%4==0&&(year%100!=0||year%400==0)){
            dayMonth[2]=29;
        }
        int totalday=0;
        for(int i=1;i<month;i++){
            totalday+=dayMonth[i];
        }
        totalday+=day1;
        System.out.println(totalday);


    }

    public static void main(String[] args) {
        String str="2024-02-09";
        day(str);
    }
}

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            if (year%4==0 || year%100==0 || year%400==0){
                return true;
            }
            else {
                return false;
            }
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean res=isLeapYear(2024);
        System.out.println(res);
    }
}


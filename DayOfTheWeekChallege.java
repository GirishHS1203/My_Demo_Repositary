public class DayOfTheWeekChallege {
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    public static void printDaysOfTheWeek(int day){
        if(day==1){
            System.out.println("Sunday");
        } else if (day==2) {
            System.out.println("Monday");
        } else if (day==3) {
            System.out.println("Tuesday");
        } else if (day==4) {
            System.out.println("Wednesday");
        } else if (day==5) {
            System.out.println("Thusday");
        } else if (day==6) {
            System.out.println("Friday");
        } else if(day==7){
            System.out.println("Saturday");
        }else {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        printDayOfTheWeek(3);
        printDaysOfTheWeek(3);

        printDayOfTheWeek(19);
        printDaysOfTheWeek(111);
    }
}

public class CalculateYearsAndDays {
//    public static void printYearsAndDays(long minutes){
//        if(minutes<0){
//            System.out.println("Invalid Value");
//        }
//        else{
//            long years=minutes/525600;
//            long remainingMinutes=(minutes-(years*525600));
//            long days=remainingMinutes/1440;
//            System.out.println(minutes+ "min = " +years+ "y and "+ days + "d");
//        }
//    }
//
//    public static void main(String[] args) {
//        printYearsAndDays(525700);
//    }
//}
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            long years= minutes/525600;
            long remainingMinutes=(minutes-(years*525600));
            long days=remainingMinutes/1440;
            System.out.println(minutes +" min = "+ years + " y and " + days +" d");
        }
    }
}

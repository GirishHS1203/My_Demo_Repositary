public class toCentimeters {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(50);
        calcFeetAndInchesToCentimeters(50,4);
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(156);


    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
        if(feet<0 || ((inches<0 || inches>12)))
        {
            System.out.println("invalid inputs");
            return -1;
        }
        else{
            double centimeters= (feet * 12)*2.54;
            centimeters += inches *2.54;
            System.out.println(feet+ " ft "+ inches+ " inch = "+ centimeters+ " cms \n \n " );
            return centimeters;

        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            System.out.println("invalid input");
            return -1;
        }
        else{
            double feet= (int) (inches/12);
            double remainingInches=(int) inches%12;
            System.out.println(inches+ "inch is : "+ feet + "ft"+ remainingInches+ "inch");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);

        }
    }


}

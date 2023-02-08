public class calculateInterestRate {

    public static double calculateInterest(double amount,double interest){
        double total= (amount*(interest/100));
        return total;
    }

    public static void main(String[] args) {
        for(int i=2;i<=8;i++){
            System.out.println("total amount = " + String.format("%.2f",calculateInterest(10000.0,i)));

        }
        System.out.println();

        for(int i=8;i>=2;i--){
            System.out.println("total amount = " + String.format("%.2f",calculateInterest(10000.0,i)));


        }
    }
}


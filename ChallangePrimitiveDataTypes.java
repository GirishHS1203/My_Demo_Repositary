public class ChallangePrimitiveDataTypes {
    public static void main(String[] args) {
        byte mybyte= 125;
        short myshort=1999;
        int myint=12;
        long mylong=50000+ (10* (mybyte + myshort + myint));
        System.out.println("The sum of long numbers is: " +mylong);

        float myfloatnum=2.23f;
        double mydoublenum=2.225d;
        double mytotal = mydoublenum + myfloatnum;
        System.out.println(mytotal);

        int num=5/3;
        float num1= 5f/3f;
        double num2=5d/3d;

        System.out.println(num+ "   " +num1+ "   " +num2);

    }
}

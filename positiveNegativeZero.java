import java.util.Scanner;
public class positiveNegativeZero {
    public static void checksum(int num) {
        if(num>0){
            System.out.println(num+ " is positive number");
        } else if (num<0) {
            System.out.println(num+ " is negative number ");
        } else {
            System.out.println(num+ " is equal to zero");
        }

    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num= sc.nextInt();
        checksum(num);

    }
}

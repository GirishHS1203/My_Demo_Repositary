import java.util.Scanner;
public class swapNumbers {
    public static void swap(int a,int b){
        System.out.println("Before Swap is: " +a+ " " +b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap is: " +a+ " " +b);
    }
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the value of a & b");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        swap(a,b);

    }
}

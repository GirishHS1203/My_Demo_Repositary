import java.util.Scanner;
public class sum {
    public static int add(int a,int b){
        int res= a + b;
        System.out.println("The Sum of a and b is:"+ res);
        return 0;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        add(a,b);


    }
}

import java.util.Scanner;
public class swtichExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch='E';

        switch (ch){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("It's letter: "+ ch);
                break;
            default:
                System.out.println("It's not found");
        }
    }
}

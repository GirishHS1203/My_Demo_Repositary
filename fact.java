import java.io.*;

public class fact {
    public static void main(String[] args) throws IOException {
        int num,fact=1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Nnumber: ");
        num=Integer.parseInt(br.readLine());
        while (num>0){
            fact=fact*num;
            num--;
        }
        System.out.println("Factorial is: " + fact);
    }
}

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Enter 5 digit numbers");
            for(int i=0;i<5;i++){
                a[i]= sc.nextInt();
            }
            System.out.println("Before Sorting \n");
            for(int i=0;i<5;i++){
                System.out.println(" " +a[i]);
            }
            bubbleSort(a,5);
            System.out.println("\n \n After Sorting\n");
            System.out.println(" \n \n Assending Order \n");
            for(int i=0;i<5;i++){
                System.out.println(" " +a[i]);
            }
            System.out.println("\n \n Decending Order \n");
            for(int i=4;i>=0;i--){
                System.out.println(" " +a[i]);
            }


        }catch(NumberFormatException e) {
            System.out.println("Enter only Integers");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter only 5 Integers");
        }
    }
    private static void bubbleSort(int[]arr,int length){
        int temp,i,j;
        for(i=0;i<length-1;i++){
            for(j=0;j<length-1;j++){
                if(arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

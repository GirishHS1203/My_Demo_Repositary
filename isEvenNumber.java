public class isEvenNumber {
    public static boolean isEvenNumbers(int num){
        if(num%2==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isEvenNumbers(45));
        System.out.println(isEvenNumbers(24));
    }
}

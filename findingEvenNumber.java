public class findingEvenNumber {
    public static boolean isevenNumber(int num){
        if(num%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isevenNumber(53));
        System.out.println(isevenNumber(40));
    }
}

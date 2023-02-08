public class evenNumbers {
    public static int evenNum(int start, int end){
        int temp=1;
        while (start<=end){
            if(start%2==0 ){
                System.out.println(start);
                temp++;
                if(temp>5){
                    break;

                }


            }start++;

        }
        return 0;
    }

    public static void main(String[] args) {
        evenNum(1,200);
    }
}

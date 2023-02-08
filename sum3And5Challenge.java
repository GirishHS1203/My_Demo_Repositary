public class sum3And5Challenge {
    public static void main(String[] args) {
        int i,n=0,sum=0;
        for( i=1;i<=1000;i++){
            if (i%3==0 && i%5==0){
                sum+=i;
                System.out.println(sum);
                n++;
                if (n == 5) {
                    break;
                }

            }
        }
        System.out.println("total sum of five numbers is :" +sum);
    }
}

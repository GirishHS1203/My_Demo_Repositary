public class PrimeNumber {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println ("number is :" +isPrime(11));
        System.out.println ("number is :" +isPrime(12));
        System.out.println ("number is :" +isPrime(13));
        System.out.println ("number is :" +isPrime(14));
        System.out.println ("number is :" +isPrime(15));



    }
}

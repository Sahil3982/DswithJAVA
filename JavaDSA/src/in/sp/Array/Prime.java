package in.sp.Array;

public class Prime {
    static boolean isPrime(int num){
        if(num==0 || num==1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num%i==0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {

        int num=50;
        for (int i = 1; i < num ; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
            }
        }
    }

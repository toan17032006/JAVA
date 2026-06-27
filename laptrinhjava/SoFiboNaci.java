package laptrinhjava;

import java.util.Scanner;

public class SoFiboNaci {
    public static long Fibo(long n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
            long a = Fibo(n);
            System.out.println(a);
            t-=1;
        }
        sc.close();
    }
}

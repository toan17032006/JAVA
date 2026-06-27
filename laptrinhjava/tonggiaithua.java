package laptrinhjava;


import java.util.Scanner;


public class tonggiaithua{
    public static long giaithua (long n){
        long result = 1;
        for(int i = 1; i<=n; i++){
            result*=i;
        }
      return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = 0;
        for(int i = 1; i<=n; i++){
            result += giaithua(i);
        }
        System.out.println(result);
        sc.close();
    }
}



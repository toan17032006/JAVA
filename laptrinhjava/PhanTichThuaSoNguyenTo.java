package laptrinhjava;

import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i<=t; i++){
            long n = sc.nextLong();
            System.out.print("Test " + i +":");
            for(int d = 2; d<=Math.sqrt(n); d++){
                if(n%d == 0){
                    int count = 0;
                    while(n % d == 0){
                        n/=d;
                        count+=1;
                    }
                    System.out.print(" " +d + "(" + count + ")");
                }
            }
            if(n > 1){
                System.out.print(" " + n +"(1)");
            }
            System.out.println();
        }
        sc.close();
    }
}

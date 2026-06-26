package laptrinhjava;

import java.util.Scanner;

public class Tongcacsotu1denN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            long a = n*(n+1)/2;
            System.out.println(a);
        }
        sc.close();
    }
}

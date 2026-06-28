package laptrinhjava;

import java.util.Scanner;

public class tansuat {
    public static boolean nguyento(int n){
        if(n == 1){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[10000];
            for(int j = 0; j < n; j++){
                a[j] = sc.nextInt();
                if(nguyento(a[j])){
                    b[a[j]] += 1;
                }
            }
            System.out.println("Test" + i + ":");                          //  đóng for j
            for(int u = 0; u < n; u++){  // nt thay vì long
                if(nguyento(a[u])){
                    System.out.println(a[u] + " xuat hien " + b[a[u]] + " lan");
                }
            }
        }
        sc.close();                   
    }
}

package laptrinhjava;

import java.util.Scanner;

public class SoNGuyenTo {
    public static boolean songuyento(long n){
        if(n < 2){
            return false;
        }
        for(long i = 2; i <=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
        // boolean phải dùng true hoặc false,không thể dùng hàm int để kiểm tra số nguyên tố
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextInt();
            if(songuyento(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t-=1;
        }
        sc.close();
    }
}

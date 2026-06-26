package laptrinhjava;
import java.util.Scanner;


public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a == 0 && b!=0){
            System.out.println("VN");
            //phương trình vô nghiệm
        }
        else if(a == 0 && b == 0){
            System.out.println("VSN");
            // phương trình có vô số nghiệm
        }
        else{
            float ketqua = -b/a;
            System.out.printf("%.2f%n",ketqua);
            //println không hỗ trợ format kiểu in ra 2 số 3 số
        }
        sc.close();
    }
}

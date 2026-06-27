package laptrinhjava;

import java.util.Scanner;

public class catdoi {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t > 0){
        String s = sc.next();
        StringBuilder result = new StringBuilder();
        boolean check = true;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);// doc 1 ky tu trong S
            if(c == '1'){
                result.append('1');
            }
            else if(c== '0'){
                result.append('0');
            }
            else if(c == '8'){
                result.append('0');
            }
            else if(c == '9'){
                result.append('0');
            }
            else{
                check = false;
                break;
            }
        }
        if(!check){
            System.out.println("INVALID");
        }
        else{
            if(result.toString().replace("0","").isEmpty()){
            // kiem tra chuoi toan so 0 bang cach thay cac so 0 thanh khoang trang ,neu la khoang chac thi la chuoi toan so 0,dung replace de thay the,giong python
               System.out.println("INVALID");// StringBuilder ko giong string thuong,stringbuilder co the thay doi duoc,neu muon replace,phai chuyen thanh string thuong
        }
           else{
               String ans = result.toString().replaceAll("^0+","");// result.to_String().replaceALL ko tự lưu kết quả,phai lưu vào biến mới
               System.out.println(ans);
           }

      }
         t-=1;
    }
    sc.close();
}
}

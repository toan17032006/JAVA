package laptrinhjava;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Giaocuahaidayso{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[m];
        Set<Integer>tree = new TreeSet<>();
        Set<Integer>tree1 = new TreeSet<>();
        for(int i = 0; i < n; i++ ){
            a[i] = sc.nextInt();
            tree.add(a[i]);
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
            tree1.add(b[i]);
        }
        tree.retainAll(tree1);// hợp hai dãy số
        for(int x : tree){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
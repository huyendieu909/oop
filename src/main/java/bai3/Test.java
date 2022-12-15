package bai3;
import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (!s.equalsIgnoreCase("DONE") && s.length()<30){
            System.out.print("\nNhap xau ki tu (nhap 'DONE' de dung lai): ");
            s = sc.nextLine();
            StringAdd ss = new StringAdd(s);
        }
    }
}

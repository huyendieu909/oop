package bai1;
import java.util.*;
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Nhap so bi chia: ");
        a = sc.nextInt();sc.nextLine();
        System.out.print("Nhap so chia: ");
        b = sc.nextInt();sc.nextLine();
        double kq;
        try 
        {   
            kq = (double) a / (double) b;
            int kqt = a/b;// biến này để tạo exception.
            //nếu chỉ dùng dòng trên thì kết quả ra Infinity, ko tạo exception
            System.out.print("ket qua a/b="+kq);
        }
        catch (ArithmeticException e){
            System.out.println("Loi chia cho 0!");
            System.out.println(e.getMessage());
        }
    }
}

package bai5;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double luong;
        System.out.print("Nhap muc luong trong pham vi tu 5.000.000 den 20.000.000: ");
        luong = sc.nextDouble();sc.nextLine();
        Luong l = new Luong(luong);
    }
}

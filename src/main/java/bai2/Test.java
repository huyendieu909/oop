package bai2;
import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ngay,thang,nam;
        System.out.print("Nhap ngay: ");
        ngay = sc.nextInt();sc.nextLine();
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();sc.nextLine();
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();sc.nextLine();
        ThoiGian tg = new ThoiGian(ngay,thang,nam);
    }
}

package bai01;
import bai01.Person;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguoi: ");
        int n = sc.nextInt();sc.nextLine();
        Person[] p = new Person[n];
        for (int i=0;i<n;i++){
            p[i] = new Person();
            System.out.print("\nNhap thong tin nguoi thu "+(i+1)+": \n");
            System.out.print("Nhap ten: ");
            p[i].setName(sc.nextLine());
            System.out.print("Nhap ngay sinh: ");
            p[i].setDob(sc.nextLine());
            System.out.print("Nhap noi sinh: ");
            p[i].setPob(sc.nextLine());
            System.out.print("Nhap gioi tinh: ");
            p[i].setGender(sc.nextLine());
            System.out.print("Nhap email: ");
            p[i].setEmail(sc.nextLine());
            System.out.print("Nhap so dien thoai: ");
            p[i].setPhone(sc.nextLine());
        }
        System.out.print("\n\tThong tin nguoi da nhap\n");
        for (int i=0;i<n;i++){
            System.out.print("Thong tin nguoi thu "+(i+1)+": \n"+p[i]);
            System.out.println();
        }
//        Person exp = new Person("HuyenDieu", "25/2/2003", "Vietnam", 'M', "quyquy909@gmail.com", "18008198");
//        System.out.println("Thong tin doi tuong: \n" + exp);
//        System.out.println();
    }
}
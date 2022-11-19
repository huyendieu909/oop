
package bai06;
import  java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int n = sc.nextInt();sc.nextLine();
        PartTimeEmployee[] nv = new PartTimeEmployee[n];
        for (int i=0;i<n;i++){
            nv[i] = new PartTimeEmployee();
            System.out.print("Nhap ten nhan vien thu "+(i+1)+": ");
            nv[i].setName(sc.nextLine());
            System.out.print("Nhap tuoi nhan vien: ");
            nv[i].setAge(sc.nextInt());sc.nextLine();
            int gt;
            do {
                System.out.print("Nhap gioi tinh (nam 1 nu 0): ");
                gt = sc.nextInt();sc.nextLine();
                nv[i].setGender(gt);
            } while (gt!=0&&gt!=1);
            System.out.print("Ten chu: ");
            nv[i].setEmployerName(sc.nextLine());
            System.out.print("Ngay duoc thue: ");
            nv[i].setDateHired(sc.nextLine());
            System.out.print("Nhap so gio lam viec trong tuan: ");
            nv[i].setHoursPerWeek(sc.nextInt());
        }
        for (int i=0;i<n;i++){
            System.out.println("Thong tin nhan vien parttime: \n"+nv[i]);
        }
       // PartTimeEmployee emp = new PartTimeEmployee("Huyen Dieu",19,'M',"Quy","11/11/2022",453);
        
    }
}

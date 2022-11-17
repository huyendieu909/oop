package bai04;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int k;//biến chỉ giới tính,nam 1 nữ 0
        System.out.print("Nhap so benh nhan: ");
        n = sc.nextInt();sc.nextLine();
        BenhNhan[] bn = new BenhNhan[n];
        for (int i=0;i<n;i++){
            bn[i] = new BenhNhan();
            System.out.println("\tBenh nhan "+(i+1));
            System.out.print("Nhap ten benh nhan: ");
            bn[i].setTen(sc.nextLine());
            System.out.print("Nhap tuoi benh nhan: ");
            bn[i].setTuoi(sc.nextInt());sc.nextLine();
            do {
                System.out.print("Nhap gioi tinh benh nhan(nam 1 nu 0): ");
                k = sc.nextInt();sc.nextLine();
                bn[i].setGioiTinh(k);}
            while (k!=1 && k!=0);
            System.out.print("Nhap tien su benh: ");
            bn[i].setTienSu(sc.nextLine());
            System.out.print("Nhap chan doan: ");
            bn[i].setChanDoan(sc.nextLine());
            System.out.print("Nhap thong tin benh vien: \n");
            BenhVien bv = new BenhVien();
            System.out.print("Nhap ten benh vien: ");
            bv.setTen(sc.nextLine());
            System.out.print("Nhap dia chi benh vien: ");
            bv.setDiaChi(sc.nextLine());
            System.out.print("Nhap ten giam doc benh vien: ");
            bv.setGiamDoc(sc.nextLine());
            bn[i].setBenhVien(bv);
        }
        System.out.println();
        for (int i=0;i<n;i++){
            System.out.println("\nThong tin benh nhan thu "+(i+1)+": ");
            System.out.print(bn[i].toString());
        }
        System.out.println();
        System.out.println("\nThong tin benh nhan gioi tinh nu: ");
        for (int i=0;i<n;i++){
            k = bn[i].getGioiTinh();
            if (k == 0){
                System.out.print(bn[i].toString());
            }
        }
        System.out.println();
        String tentest;// nhập tên này và tìm xem trong list có bn nào ko thì in ra
        System.out.println("Nhap ten cua benh nhan muon xem thong tin: ");
        tentest = sc.nextLine();
        HashMap<Integer,Integer> memo = new HashMap<Integer,Integer>();
        int cnt=0;//biến này để đếm
        String temp;//biến tạm lưu tên
        for (int i=0;i<n;i++){
            temp = bn[i].getTen();
            if (temp.equalsIgnoreCase(tentest)){
                cnt++;
                memo.put(cnt, i);
            }
        }
        if (cnt == 0) System.out.println("Khong co benh nhan nao co ten vua nhap.");
        else {
            System.out.println("Co "+cnt+" benh nhan co ten nhu vua nhap");
            for (int i=1;i<=cnt;i++){
                System.out.println("\tBenh nhan "+i);
                System.out.println(bn[memo.get(i)].toString());
            }
        }
    }
}
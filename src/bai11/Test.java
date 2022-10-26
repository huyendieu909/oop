package bai11;
public class Test {
    public static void main(String[] args){
        GVCoHuu gv1 = new GVCoHuu("Nguyen Huu Thang", "Ha Nam", 1, 1234000.0, 1.23, 10.0);
        GVThinhGiang gv2 = new GVThinhGiang("Pham Mai Khanh","Ha Noi",2,100,30000.0);
        System.out.println("Thong tin giang vien co huu: \n"+gv1.inThongTin());
        System.out.println("\nThong tin giang vien thinh giang: \n"+gv2.inThongTin());
    }
}

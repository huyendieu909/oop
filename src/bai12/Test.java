package bai12;
public class Test {
    public static void main(String[] args){
        SVCDN sv1 = new SVCDN("Nguyen Ngoc Ngan","11/11/1991","Ha Noi","Cao dang nghe",7.2,8);
        SVCDCQ sv2 = new SVCDCQ("Duong Mich","22/11/1991","Ha Giang","Cao dang chinh quy",9.9,9,10);
        System.out.println("Thong tin sinh vien cao dang nghe: \n"+sv1.inThongTin());
        System.out.println("\nThong tin sinh vien cao dang chinh quy: \n"+sv2.inThongTin());
    }
}

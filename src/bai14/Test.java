package bai14;
public class Test {
    public static void main(String[] args){
        CNKSP cn1 = new CNKSP("Vo Song","Ha Noi","11/11/1991","khoan san pham",1100,500000.0,1f);
        CNTCN cn2 = new CNTCN("Doraemon","Nhat Bon","3/9/2112","tinh cong nhat",20,5000000f,1.25,1f);
        System.out.println("Thong tin cong nhan khoan san pham: \n"+cn1.inThongTin());
        System.out.println("\nThong tin cong nhan tinh cong nhat: \n"+cn2.inThongTin());
    }
}
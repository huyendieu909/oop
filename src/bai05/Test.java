
package bai05;

public class Test {
    public static void main(String[] args){
        Truong hla = new Truong("Hoa Lu A", "Hoa Lu, Ninh Binh","Khong ro");
        SinhVien sv = new SinhVien("Huyen Dieu",19,'M',"12A","IT",hla);
        System.out.println("Thong tin sinh vien: \n"+sv);
    }
}

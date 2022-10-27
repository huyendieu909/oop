package bai13;
public class Test {
    public static void main(String[] args){
        LaoDongPhoThong nld = new LaoDongPhoThong("Vo Song","Ha Noi, Viet Nam","pho thong",20,500000f,1f);
        KiSu ks = new KiSu("Quy Lem","Thu Dau Mot","ki su",5000000f,1.2,1f,20);
        System.out.println("Thong tin nguoi lao dong: \n"+nld.inThongTin());
        System.out.println("\nThong tin ki su: \n"+ks.inThongTin());
    }
}

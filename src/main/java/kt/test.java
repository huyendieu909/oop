package kt;
import java.util.*;
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // in = System.out.print
        int choice = 0;
        Car[] car = new Car[3];
        Truck[] truck = new Truck[3];
        while (choice != 5){
            menu();
            in("Lua chon cua ban: ");
            choice = sc.nextInt();sc.nextLine();
            switch(choice){
                case 1 -> {
                    in("\tEnter information of 3 cars: \n");
                    for (int i=0;i<1;i++){
                        car[i] = new Car();
                        in("Enter inf of the car no. "+(i+1)+": \n");
                        in("Enter maker: ");
                        car[i].setMaker(sc.nextLine());
                        in("Enter model: ");
                        car[i].setModel(sc.nextLine());
                        in("Enter price: ");
                        car[i].setPrice(sc.nextDouble());sc.nextLine();
                        car[i].input();
                    }
//                    in("\tEnter information of 3 trucks: \n");
//                    for (int i=0;i<1;i++){
//                        truck[i] = new Truck();
//                        in("Enter inf of the truck no. "+(i+1)+": \n");
//                        in("Enter maker: ");
//                        truck[i].setMaker(sc.nextLine());
//                        in("Enter model: ");
//                        truck[i].setModel(sc.nextLine());
//                        in("Enter price: ");
//                        truck[i].setPrice(sc.nextDouble());sc.nextLine();
//                        truck[i].input();
//                    }
                    in("input done!\n");
                    break;
                }
                case 2 -> {
                    in("\tInformation of 3 cars: \n");
                    for(int i=0;i<1;i++){
                        car[i].display();
                    }
//                    in("\tInformation of 3 trucks: \n");
//                    for (int i=0;i<1;i++){
//                        truck[i].display();
//                    }
                    in("display done!\n");
                    break;
                }
                default -> {
                    in("Wrong input!\n");
                }
            }
        }
    }
    static void in(String s){
        System.out.print(s);
    }
    static void menu(){
        in("\nChon 1 trong 5 lua chon sau bang cach nhap so tuong ung: \n");
        in("1. Input\n");// nhap vao 3 car va 3 truck
        in("2. Display\n");//hien thi 3 car va 3 truck
        in("3. Sort by price\n");
        in("4. Search by model\n");
        in("5. Exit\n");
    }
}

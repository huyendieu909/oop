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
                    case1(car,truck);
                    break;
                }
                case 2 -> {
                    case2(car,truck);
                    break;
                }
                case 4 -> {
                    String s;
                    in("Enter model you want to search: ");
                    s = sc.nextLine();
                    in("Result: ");
                    for (int i=0;i<3;i++){
                        
                    }
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
    static void case1(Car[] car,Truck[] truck){
        in("\tEnter information of 3 cars: \n");
        for (int i=0;i<1;i++){
            car[i] = new Car();
            in("Enter information of the car no. "+(i+1)+": \n");
            car[i].input();
        }
        in("\tEnter information of 3 trucks: \n");
        for (int i=0;i<1;i++){
            truck[i] = new Truck();
            in("Enter inf of the truck no. "+(i+1)+": \n");
            truck[i].input();
        }
        in("input done!\n");
    }
    static void case2(Car[] car,Truck[] truck){
        if (car[0] == null) throw new NullPointerException("You haven't enter information of cars and trucks!");
        in("\tInformation of 3 cars: \n");
        for(int i=0;i<1;i++){
            car[i].display();
        }
        in("\tInformation of 3 trucks: \n");
        for (int i=0;i<1;i++){
            truck[i].display();
        }
        in("display done!\n");
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

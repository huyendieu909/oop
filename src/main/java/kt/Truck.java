package kt;
import java.util.Scanner;
public class Truck extends Vehicles implements Vehicle{
    private int truckload;
    public Truck(){
        
    }
    public Truck(String maker, String model, double price, int truckload){
        super(maker,model,price);
        this.truckload = truckload;
    }
    public void setTruckload(int truckload){
        this.truckload = truckload;
    }
    public int getTruckload(){
        return truckload;
    }
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        in("Enter truckload: ");
        this.truckload = sc.nextInt();
        sc.nextLine();
    }
    
    @Override
    public void display(){
        in("Maker: "+getMaker()+"\n");
        in("Model: "+getModel()+"\n");
        in("Price: "+getPrice()+"\n");
        in("Truckload: "+this.truckload+"\n");
    }
    
    static void in(String s){
        System.out.print(s);
    }
}

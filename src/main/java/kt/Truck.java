package kt;
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
        super.input();
        in("Enter truckload: ");
        this.truckload = sc.nextInt();sc.nextLine();
    }
    
    @Override
    public void display(){
        super.display();
        in("\nTruckload: "+getTruckload()+"\n");
    }
    
    static void in(String s){
        System.out.print(s);
    }
}

package kt;
public class Car extends Vehicles implements Vehicle{
    private String color;
    public Car(){
        
    }
    public Car(String maker, String model, double price, String color){
        super(maker,model,price);
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    @Override
    public void input(){
        super.input();
        in("Enter color: ");this.color = sc.nextLine();
    }
    
    @Override
    public void display(){
        super.display();
        in("\nColor: "+this.getColor()+"\n");
    }
    
    static void in(String s){
        System.out.print(s);
    }
}


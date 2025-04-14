// Attributes: brand, processor, ramSize, price, graphicsCard
public class Laptop {
    String brand;
    String processor;
    int ramSize;
    double price;
    String graphicsCard;

    Laptop(String brand,String processor,int ramSize,double price,String graphicsCard){
        this.brand=brand;
        this.processor=processor;
        this.ramSize=ramSize;
        this.price=price;
        this.graphicsCard=graphicsCard;
    }
    public void displayLaptop(){
        System.out.println(brand);
        System.out.println(processor);
        System.out.println(ramSize);
        System.out.println(price);
        System.out.println(graphicsCard);

    }
    
}

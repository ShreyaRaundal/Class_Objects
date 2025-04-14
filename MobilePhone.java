// Attributes: model, brand, price, storage, batteryCapacity
public class MobilePhone {
    String model;
    String brand;
    double price;
    double storage;
    double batteryCapacity;

    MobilePhone(String model,String brand,double price,double storage,double batteryCapacity){
        this.model=model;
        this.brand=brand;
        this.price=price;
        this.storage=storage;
        this.batteryCapacity=batteryCapacity;

    }
    public void displayMobilePhone(){
        System.out.println(model);
        System.out.println(brand);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(batteryCapacity);
    }
    
}

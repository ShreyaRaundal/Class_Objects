public class Marker{
    String nib;
    String color;
    double price;
    String brand;
    String type;

    Marker(String nib,String color,double price,String brand ,String type){
        System.out.println("From constructor");
        this.nib=nib;
        this.color=color;
        this.price=price;
        this.brand=brand;
        this.type=type;
        System.out.println("Constructors");
    }
    public void displayMarker(){
        System.out.println(nib);
        System.out.println(color);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(type);
        

    }
}
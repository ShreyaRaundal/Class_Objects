public class Book1 {
    int page;
    double price;
    String brand;
    String size;
    String bind;

    Book1(int page,double price,String brand,String size,String bind){
        System.out.println("Constructor sart");
        this.page=page;
        this.price=price;
        this.brand=brand;
        this.size=size;
        this.bind=bind;
        System.out.println("Constructor end");
    }
    public void displayBook1(){
        System.out.println("page");
        System.out.println("price");
        System.out.println("brand");
        System.out.println("size");
        System.out.println("bind");

    }
}

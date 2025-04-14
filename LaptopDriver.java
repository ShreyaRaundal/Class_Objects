public class LaptopDriver {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP", "Intel i5", 8, 55000.0, "NVIDIA GeForce");
        l1.displayLaptop();
    
        System.out.println("-----------------------");
    
        Laptop l2 = new Laptop("Dell", "Ryzen 7", 16, 72000.0, "AMD Radeon");
        l2.displayLaptop();
    }
    
}

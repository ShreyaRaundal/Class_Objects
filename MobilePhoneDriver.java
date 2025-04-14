public class MobilePhoneDriver {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Galaxy S22", "Samsung", 69999.0, 128, 4500);
        m1.displayMobilePhone();

        System.out.println("-----------------------------");

        MobilePhone m2 = new MobilePhone("iPhone 14", "Apple", 79999.0, 256, 3279);
        m2.displayMobilePhone();
    }
}

public class MarkerDriver {
    public static void main(String[] args){
        
        Marker m1 = new Marker("thin", "red", 15.0, "comed", "permanent");

        System.out.println("--------------------------------------");
        
        Marker m2=new Marker("thick","blue",30,"camel","temprary");
        m2.displayMarker();

    }
}

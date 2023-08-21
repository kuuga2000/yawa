class Carx {
    String brand;
    int price;
    static String name;

    //called only one in every called
    static {
        name = "AAAA";
    }

    //call in every called
    public Carx() {
        brand = "Honda";
        price = 20000;
    }

    public void show() {
        System.out.println(brand + " - " + name + " - " + price);
    }
}
public class StaticBlock {

    public static void main(String args[]) {
        Carx car1 = new Carx();
        car1.brand = "HHH";
        car1.show();
    }
}

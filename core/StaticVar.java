class Phone {
    String brand;
    int price;
    String name;
    static String name2;

    public void show() {
        System.out.println(brand + " - " + price + " - " + name + " - " + name2);
    }
}

public class StaticVar {
    public static void main(String args[]) {
        Phone mobile1 = new Phone();
        mobile1.brand = "Samsung";
        mobile1.price = 10000;
        mobile1.name = "Phone";
        Phone.name2 = "XXX";


        Phone mobile2 = new Phone();
        mobile2.brand = "Motorola";
        mobile2.price = 10000;
        mobile2.name = "Phone";
        Phone.name2 = "xxPhone";


        mobile1.show();
        mobile2.show();
    }
}

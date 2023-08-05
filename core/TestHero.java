class Hero {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class TestHero {
    public static void main(String[] args) {
        Hero e1 = new Hero();
        Hero e2 = new Hero();
        Hero e3 = new Hero();
        e1.insert(111, "Anti-Mage", 55000);
        e2.insert(112, "Blood Seeker", 35000);
        e3.insert(113, "Slardar", 65000);
        e1.display();
        e2.display();
        e3.display();
    }
}
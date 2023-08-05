class Plane {
    int id;
    String name;
    int age;

    static int count = 20;

    Plane(int i, String n) {
        id = i;
        name = n;
    }

    Plane(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age + " " + count);
    }

    public static void main(String args[]) {
        Plane p1 = new Plane(800, "Boeing");
        Plane p2 = new Plane(380, "Airbus",300);
        p1.display();
        p2.display();
    }
}
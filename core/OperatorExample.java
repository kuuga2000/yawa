public class OperatorExample {
    public static void main(String[] args) {
        int z = 10;
        System.out.println(z++);// 10 (11)
        System.out.println(++z);// 12
        System.out.println(z--);// 12 (11)
        System.out.println(--z);// 10

        System.out.println("=========================================");
        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);// -11 (minus of total positive value which starts from 0)
        System.out.println(~b);// 9 (positive of total minus, positive starts from 0)
        System.out.println(!c);// false (opposite of boolean value)
        System.out.println(!d);// true

        System.out.println(a);
        System.out.println(a);
    }
}
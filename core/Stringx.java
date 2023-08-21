public class Stringx {

    public static void main(String args[]) {
        String name = "Blood";
        name = name + " Seeker";

        String spec = new String("Baratum");

        System.out.println(name);
        System.out.println(spec.charAt(2));
        System.out.println(spec.concat(" BB"));

        System.out.println();System.out.println();System.out.println();

        StringBuffer sb = new StringBuffer("Blood");

        System.out.println(sb.capacity());
        String str = sb.delete(2,4).toString();
        System.out.println(str);

        System.out.println();System.out.println();System.out.println();

        StringBuffer heroName = new StringBuffer("Anti");

        heroName.append(" Mage");
        heroName.insert(5,"TEST ");
        heroName.setLength(20);
        System.out.println(heroName);

    }
}

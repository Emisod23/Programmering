package src;

public class Komplextest {

    public static void main(String[] args) {
        Komplex a = new Komplex(3.0,2.0);
        Komplex b = new Komplex(4.0,1.0);

        System.out.println("talet borde vara 3 + 2i:\n" + a);
        System.out.println(a.v + a.v1 + b.v + b.v1);
        Komplex c = a.add(b);
        Komplex d = new Komplex(7,3);

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("add funkar!!");
        }

        /*c = a.multiply(b);
        d = new Komplex(10,11);

        System.out.println(c);
        if (c.equals(d)) {
            System.out.println("multiply funkar!!");
        }

        System.out.println("Argumentet till 3+2i är " + a.arg());
        if (a.arg() == Math.atan(2.0/3)) {
            System.out.println("arg() funkar!!");
        }*/
    }
}
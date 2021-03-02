package src;

public class Komplex {
    double v;
    double v1;

    public Komplex(double v, double v1) {
        this.v = v;
        this.v1 = v1;
    }

    @Override
    public String toString() {
        return v + "+" + v1 + "i";
    }

    /*public Komplex add(Komplex b) {

    }

    /*public Komplex multiply(Komplex b) {
    }

    public double arg() {
    }*/
}

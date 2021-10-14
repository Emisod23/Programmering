/*package src;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.v, v) == 0 && Double.compare(komplex.v1, v1) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v, v1);
    }

    public Komplex add(Komplex b) {
        double newv = b.v + this.v;
        double newv1 = b.v1 + this.v1;
        return new Komplex(newv, newv1);
    }

    public Komplex multiply(Komplex b) {

    }

    public double arg() {
    }
}*/

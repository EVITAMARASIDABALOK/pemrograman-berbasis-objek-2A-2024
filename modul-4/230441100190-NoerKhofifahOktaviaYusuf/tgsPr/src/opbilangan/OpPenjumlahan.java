package opbilangan;

public class OpPenjumlahan extends OpBilangan {
    public OpPenjumlahan(double a, double b) {
        set_A(a);
        set_B(b);
    }

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C(double c) {
        this.c = c;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        c = get_A() + get_B();
        return c;
    }

    protected void tampil() {
        System.out.println("================================");
        System.out.println("Hasil Penjumlahan A + B = " + get_C());
        System.out.println("================================");

    }
}

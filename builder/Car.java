package builder;

public class Car {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public String getA() {
        return this.a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return this.b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return this.c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return this.d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return this.e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getF() {
        return this.f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public Car(Builder builder) {
        if (builder.getA().equals("a")) {
            this.d = "d";
        } else if (builder.getA().equals("A")) {
            this.d = "D";
        } else {
            this.d = "dD";
        }

        if (builder.getB().equals("b")) {
            this.e = "e";
        } else if (builder.getB().equals("B")) {
            this.e = "E";
        } else {
            this.e = "eE";
        }

        if (builder.getC().equals("c")) {
            this.f = "f";
        } else if (builder.getC().equals("C")) {
            this.f = "F";
        } else {
            this.f = "fF";
        }

        a = builder.getA();
        b = builder.getB();
        c = builder.getC();
    }

    @Override
    public String toString() {
        return "{" + " a='" + getA() + "'" + ", b='" + getB() + "'" + ", c='" + getC() + "'" + ", d='" + getD() + "'"
                + ", e='" + getE() + "'" + ", f='" + getF() + "'" + "}";
    }

}
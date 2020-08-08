package builder;

public class Builder {
    private String a;
    private String b;
    private String c;

    public Car build() throws Exception {
        if (a == null || b == null || c == null)
            throw new Exception("please give a and b and c");
        return new Car(this);
    }

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

    Builder a(String a) {
        this.a = a;
        return this;
    }

    Builder b(String b) {
        this.b = b;
        return this;
    }

    Builder c(String c) {
        this.c = c;
        return this;
    }
}
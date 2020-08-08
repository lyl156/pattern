package builder;

public class test {
    public static void main(String[] args) throws Exception {
        System.out.println("aaa");
        Builder builder = new Builder();
        Car car = builder.a("A").b("b").c("c").build();
        System.out.println(car);
    }
}
package composite;

public class test {
    public static void main(String[] args) {
        Leaf l1 = new Leaf("leaf1");
        Leaf l2 = new Leaf("leaf2");
        Composite c1 = new Composite("composite1");
        c1.add(l1);
        c1.add(l2);
        Leaf l3 = new Leaf("leaf3");
        Composite c2 = new Composite("composite2");
        c2.add(l3);

        c1.add(c2);
        c1.execute();
    }
}

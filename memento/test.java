package memento;


public class test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("state1");

        Caretaker caretaker = new Caretaker(originator);
        System.out.println(originator.toString());

        caretaker.record();
        originator.setState("state2");
        System.out.println(originator.toString());

        caretaker.record();
        originator.setState("state3");
        System.out.println(originator.toString());

        System.out.println("---undo---");

        caretaker.undo();
        System.out.println(originator.toString());

        System.out.println("---undo---");

        caretaker.undo();
        System.out.println(originator.toString());
    }

}

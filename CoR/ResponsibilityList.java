package CoR;

public class ResponsibilityList {
    private boolean state1;
    private boolean state2;
    private boolean state3;

    public void setState1(boolean state1) {
        this.state1 = state1;
    }

    public void setState2(boolean state2) {
        this.state2 = state2;
    }

    public void setState3(boolean state3) {
        this.state3 = state3;
    }

    public boolean isState1() {
        return state1;
    }

    public boolean isState2() {
        return state2;
    }

    public boolean isState3() {
        return state3;
    }
}

package facade;

public class Facade {
    private MorningSystem morningSystem = new MorningSystem();
    private NoonSystem noonSystem = new NoonSystem();
    private NightSystem nightSystem = new NightSystem();

    public void startInMorning() {
        morningSystem.operation();
        noonSystem.operation();
        nightSystem.operation();
    }

    public void startInNoon() {
        noonSystem.operation();
        nightSystem.operation();
        morningSystem.operation();
    }

    public void startAtNight() {
        nightSystem.operation();
        morningSystem.operation();
        noonSystem.operation();
    }
}
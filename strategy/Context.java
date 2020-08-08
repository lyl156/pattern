package strategy;

public class Context {
    public Strategy strategy = null;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void doCalculate() throws Exception {
        if (strategy == null)
            throw new Exception("strategy needed");
        System.out.println("algo 1");
        System.out.println("algo 2");
        strategy.algorithm();
    }
}
package strategy;

import java.util.logging.Logger;

public class test {
    final private static Logger logger = Logger.getLogger("test");

    public static void main(String[] args) throws Exception {
        logger.info("this is strategy pattern");
        Context context = new Context();
        Strategy strategyA = new StrategyA();
        Strategy strategyB = new StrategyB();

        context.setStrategy(strategyA);
        context.doCalculate();

        context.setStrategy(strategyB);
        context.doCalculate();
    }
}
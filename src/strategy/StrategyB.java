package strategy;

public class StrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executando a estratégia B");
    }
}

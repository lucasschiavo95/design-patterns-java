package strategy;

public class StrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executando a estratégia A");
    }
}

package strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Strategy strategyA = new StrategyA();
        Strategy strategyB = new StrategyB();

        strategyA.execute(); // Deve imprimir "Executando a estratégia A"
        strategyB.execute(); // Deve imprimir "Executando a estratégia B"
    }
}

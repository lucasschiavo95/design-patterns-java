package facade;

public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
        subsystemC = new SubsystemC();
    }

    public void doSomething() {
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}

package facade;

public class FacadeDemo {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doSomething();
        /*
        Deve imprimir:
        Subsystem A - Operação A
        Subsystem B - Operação B
        Subsystem C - Operação C
        */
    }
}

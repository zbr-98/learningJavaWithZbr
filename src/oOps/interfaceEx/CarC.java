package oOps.interfaceEx;

class lab01{
    public static void main(String[] args) {
        CarC c1= new CarC();
        c1.startEngine();
        c1.haltingEngineJustStart();
        c1.haltingEngineJustStop();
        c1.stopEngine();

        E.M1();

    }
}

public class CarC implements E{

    @Override
    public void startEngine() {
        System.out.println("Starting the engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine");
    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

}

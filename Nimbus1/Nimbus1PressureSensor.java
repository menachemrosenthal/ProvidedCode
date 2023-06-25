package WS1.StudentCode.Nimbus1;

import WS1.StudentCode.Observables.Sensor;

import java.util.Random;

public class Nimbus1PressureSensor extends Sensor {
    private Random rnd = RandomSupplier.getRnd();
    public Nimbus1PressureSensor(String s, int i) {
        super(s, i);
        System.out.println("pressure registered to clock");
    }

    @Override
    protected int read() {

        return rnd.nextInt(100) + 950;// return rnd.nextInt(40);

    }


}

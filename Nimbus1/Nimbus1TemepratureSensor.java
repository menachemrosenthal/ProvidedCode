package WS1.StudentCode.Nimbus1;

import WS1.StudentCode.Observables.Sensor;

import java.util.Random;

public class Nimbus1TemepratureSensor extends Sensor {
    private Random rnd = RandomSupplier.getRnd();

    public Nimbus1TemepratureSensor(String s, int i) {
        super(s, i);
        System.out.println("temperature registered to clock");
    }

    @Override
    protected int read() {
       return rnd.nextInt(40);//return rnd.nextInt(100) + 950;
    }

}

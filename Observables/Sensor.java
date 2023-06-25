package WS1.StudentCode.Observables;

import WS1.StudentCode.Nimbus1.Nimbus1Clock;

public abstract class Sensor extends Observable<Integer>{
    protected int lastReading;
    protected int interval;
    protected String type;
    public Sensor(String s, int i){
        type = s;
        interval = i;
        (Nimbus1Clock.theInstance()).register(interval, new SensorAlarmListener(this));
    }
    protected abstract int read();

    public void check(){
        int data = read();
        if(lastReading != data){
            notifyObservers(data);
            lastReading = data;
        }
    }
}

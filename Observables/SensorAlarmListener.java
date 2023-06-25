package WS1.StudentCode.Observables;

public class SensorAlarmListener implements AlarmListener {
    Sensor sensor;
    public SensorAlarmListener(Sensor s){
        sensor = s;
    }
    @Override
    public void wakeUp() {
        sensor.check();
    }
}

package WS1.StudentCode.Observables;

import WS1.StudentCode.Observers.Observer;

public class PressureTrendSensor extends Observable<Trend> implements Observer<Integer> {
    private int lastReading1 =0;
    private int lastReading2 = 0;
    private int lastReading3 = 0; // don't need but it was in the targil
    private Trend pressureState;  // don't need but it was in the targil
    private Trend lastState = Trend.STABLE;

    public PressureTrendSensor(){}

    public Trend calculate(int data){
        lastReading3 = lastReading2;
        lastReading2 = lastReading1;
        lastReading1 = data;

        if(lastReading1<lastReading2 && lastReading2 < lastReading3)
            return Trend.FALLING;
        if (lastReading1>lastReading2 && lastReading2>lastReading3)
            return Trend.RISING;
        return Trend.STABLE;
    }


    public void check(int data){
        pressureState = calculate(data);
        if(lastState != pressureState){
            notifyObservers(pressureState);
            lastState = pressureState;
        }
    }

    @Override
    public void update(Integer data) {
        check(data);
    }
}

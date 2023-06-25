package WS1.StudentCode.Observables;

public class AlarmClockRecord {

    private int interval;
    private int remainingTime;
    private AlarmListener alarmListener;

    public AlarmClockRecord(int interval, AlarmListener al) {
        this.interval = interval;
        remainingTime = interval;
        alarmListener = al;
    }
    public int getRemainingTime() {
        return remainingTime;
    }

    public int getInterval() {
        return interval;
    }

    public AlarmListener getAlarmListener() {
        return alarmListener;
    }

    public void setRemainingTime(int interval) {
        remainingTime = interval;
    }

    public void decrementRemainingTime(int rt) {
        remainingTime = remainingTime - rt;
    }
}

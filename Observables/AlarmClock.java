package WS1.StudentCode.Observables;


import WS1.StudentCode.Nimbus1.Nimbus1Clock;

import java.util.ArrayList;

public class AlarmClock
{
    public final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> alarmClockRecord = new ArrayList<>();

    protected AlarmClock() {}
    public static AlarmClock theInstance()
    {
        if(null==instance)
            instance = new AlarmClock();
        return instance;
    }


    protected void tic(){
        for(AlarmClockRecord record : alarmClockRecord) {
            if (record.getRemainingTime() - CLOCK_INTERVAL_MILLIS <= 0){
                record.getAlarmListener().wakeUp();
                record.setRemainingTime(record.getInterval());
            }
            else{
                record.decrementRemainingTime(CLOCK_INTERVAL_MILLIS);
            }
        }
    }

    public void register(int interval, AlarmListener pal) {
        alarmClockRecord.add(new AlarmClockRecord(interval, pal));
    }

}


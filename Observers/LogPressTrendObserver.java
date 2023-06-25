package WS1.StudentCode.Observers;

import WS1.StudentCode.Observables.Trend;

public class LogPressTrendObserver implements Observer<Trend>{
    Log log;

    public LogPressTrendObserver(Log l) {
        this.log = l;
        System.out.println("LogPressTrendObserver was created");
    }

    @Override
    public void update(Trend data) {
        log.displayPressureTrend(data);
    }
}

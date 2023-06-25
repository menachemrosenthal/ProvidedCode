package WS1.StudentCode.Observers;

import WS1.StudentCode.Observables.Trend;
import WS1.StudentCode.Observables.WeatherMonitoringSystem;

public class Log {
    public Log(WeatherMonitoringSystem ws) {
        System.out.println("Log was created");
        ws.addPressureObserver(new LogPressObserver(this));
        System.out.println("LogPressObserver observes pressure");
        ws.addPressureTrendObserver(new LogPressTrendObserver(this));
        System.out.println("LogPressTrendObserver observes pressure trend");
    }

    public void displayPressure(int pressure){
        System.out.println("Log: pressure = " +pressure + " millibars");
    }
    public void displayPressureTrend(Trend pt){
        System.out.println("Log: pressure trend = " + pt);

    }
}

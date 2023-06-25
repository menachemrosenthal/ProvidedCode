package WS1.StudentCode.Observers;

import WS1.StudentCode.Observables.WeatherMonitoringSystem;

public class MonitoringScreen {
    public MonitoringScreen(WeatherMonitoringSystem ws) {
        System.out.println("MonitoringScreen" + " was created");
        ws.addTemperatureObserver(new MSTempObserver(this));
        System.out.println("MSTempObserver observes temperature");
        ws.addPressureObserver(new MSPressObserver(this));
        System.out.println("MSPressObserver observes pressure");
    }

    public void displayPressure(int pressure){
        System.out.println("MonitoringScreen: pressure = " + pressure + " millibars");
    }
    public void displayTemeprature(int temp){
        System.out.println("MonitoringScreen: temperature = " + temp + " Celsius");
    }
}

package WS1.StudentCode.System;


import WS1.StudentCode.Observables.WeatherMonitoringSystem;
import WS1.StudentCode.Observers.*;



public class MainClassWS1
{
    public static void main(String[] args) {
        WeatherMonitoringSystem ws = WeatherMonitoringSystem.theInstance();

        MonitoringScreen p_MonitorScreen = new MonitoringScreen(ws);
        Log p_log = new Log(ws);
    }
}

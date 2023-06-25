package WS1.StudentCode.Observables;


import WS1.StudentCode.Nimbus1.Nimbus1PressureSensor;
import WS1.StudentCode.Nimbus1.Nimbus1TemepratureSensor;
import WS1.StudentCode.Observers.Observer;

public class WeatherMonitoringSystem {
    private Nimbus1PressureSensor nimbus1PressureSensor;// = new Nimbus1PressureSensor("Nimbus1PressureSensor", 1100);
    private Nimbus1TemepratureSensor nimbus1TemepratureSensor; // = new Nimbus1TemepratureSensor("Nimbus1TemepratureSensor", 700);
    private PressureTrendSensor pressureTrendSensor; // = new PressureTrendSensor();

    private static WeatherMonitoringSystem instance = null;

    protected WeatherMonitoringSystem() {
        nimbus1PressureSensor = new Nimbus1PressureSensor("Nimbus1PressureSensor", 1100);
        nimbus1TemepratureSensor = new Nimbus1TemepratureSensor("Nimbus1TemepratureSensor", 700);
        pressureTrendSensor = new PressureTrendSensor();
        nimbus1PressureSensor.addObserver(pressureTrendSensor);
        System.out.println("PressureTrendSensor observes pressure");
    }
    public static WeatherMonitoringSystem theInstance()
    {
        if(null==instance) {
            System.out.println("WeatherMonitoringSystem was created");
            instance = new WeatherMonitoringSystem();
        }
        return instance;
    }
    public void addPressureObserver(Observer<Integer> observer){
        nimbus1PressureSensor.addObserver(observer);
    }
    public void addPressureTrendObserver(Observer<Trend> observer){
        pressureTrendSensor.addObserver(observer);
    }
    public void addTemperatureObserver(Observer<Integer> observer){
        nimbus1TemepratureSensor.addObserver(observer);
    }
}

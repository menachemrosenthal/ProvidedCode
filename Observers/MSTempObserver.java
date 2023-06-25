package WS1.StudentCode.Observers;

public class MSTempObserver implements Observer<Integer>{
    MonitoringScreen monitoringScreen;

    public MSTempObserver(MonitoringScreen monitoringScreen) {
        this.monitoringScreen = monitoringScreen;
        System.out.println("MSTempObserver was created");
    }

    @Override
    public void update(Integer data) {
        monitoringScreen.displayTemeprature(data);
    }
}

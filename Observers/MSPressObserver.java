package WS1.StudentCode.Observers;

public class MSPressObserver implements Observer<Integer>{
    MonitoringScreen monitoringScreen;

    public MSPressObserver(MonitoringScreen monitoringScreen) {
        this.monitoringScreen = monitoringScreen;
        System.out.println("MSPressObserver was created");
    }

    @Override
    public void update(Integer data) {
        monitoringScreen.displayPressure(data);
    }
}

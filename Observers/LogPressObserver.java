package WS1.StudentCode.Observers;

public class LogPressObserver implements Observer<Integer>{
    Log log;

    public LogPressObserver(Log l) {
        this.log = l;
        System.out.println("LogPressObserver was created");
    }

    @Override
    public void update(Integer data) {
        log.displayPressure(data);
    }
}

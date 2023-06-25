package WS1.StudentCode.Observables;

import WS1.StudentCode.Observers.Observer;

import java.util.ArrayList;

public class Observable<T> {
    private ArrayList<Observer<T>> itsObservers = new ArrayList<>();
    public void addObserver(Observer<T> observer){
        itsObservers.add(observer);
    }
    public void notifyObservers(T data){
        for(Observer<T> o : itsObservers){
            o.update(data);
        }
    }
    public void removeObserver(Observer<T> observer){
        itsObservers.remove(observer);
    }
}

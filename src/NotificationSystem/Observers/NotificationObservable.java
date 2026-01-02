package NotificationSystem.Observers;

import NotificationSystem.Decorators.INotification;

import java.util.ArrayList;
import java.util.List;

public class NotificationObservable implements IObservable {
    private List<IObserver> observers ;
    private INotification currentNotification ;
    public NotificationObservable(){
        observers=new ArrayList<>();
    }
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer:observers){
            observer.update();
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void setNotification(INotification notification){
        currentNotification=notification;
        notifyObservers();
    }

    public INotification getCurrentNotification(){
        return currentNotification ;
    }

    String getNotificationContent(){
        return currentNotification.getContent();
    }
}
package NotificationSystem.Observers;

import NotificationSystem.Decorators.INotification;

public interface IObservable {
    void addObserver(IObserver observer) ;
    void notifyObservers() ;
    void removeObserver(IObserver observer) ;
    void setNotification(INotification notification) ;
}

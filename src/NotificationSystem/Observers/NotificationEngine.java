package NotificationSystem.Observers;

import NotificationSystem.Strategies.INotificationStrategy;

import java.util.ArrayList;
import java.util.List;

public class NotificationEngine implements IObserver {
     private NotificationObservable notificationObservable ;
     private List<INotificationStrategy> notificationStrategies = new ArrayList<>();
    public NotificationEngine(NotificationObservable notificationObservable){
        this.notificationObservable=notificationObservable;
    }
    public void addStrategy(INotificationStrategy strategy){
        notificationStrategies.add(strategy);
    }
    @Override
    public void update() {
        for(INotificationStrategy strategy:notificationStrategies){
            strategy.sendNotification(notificationObservable.getNotificationContent());
        }
    }
}
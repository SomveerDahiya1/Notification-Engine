package NotificationSystem.Managers;

import NotificationSystem.Decorators.INotification;
import NotificationSystem.Observers.NotificationObservable;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private static NotificationManager notificationManager =null ;
    private NotificationObservable notificationObservable;
    List<INotification> notifications = new ArrayList<>();
    private NotificationManager(){
        notificationObservable=new NotificationObservable();
    }
    public static NotificationManager getInstance(){
        if(notificationManager ==null){
            notificationManager=new NotificationManager();
        }
        return notificationManager ;
    }
    public NotificationObservable getObservable() {
        return notificationObservable;
    }

    public void sendNotification(INotification notification) {
        notifications.add(notification);
        notificationObservable.setNotification(notification);
    }
}
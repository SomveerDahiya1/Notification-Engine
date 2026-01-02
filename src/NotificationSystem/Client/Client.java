package NotificationSystem.Client;
import NotificationSystem.Decorators.INotification;
import NotificationSystem.Decorators.SimpleNotification;
import NotificationSystem.Decorators.TimeStampDecorator;
import NotificationSystem.Managers.NotificationManager;
import NotificationSystem.Observers.NotificationEngine;
import NotificationSystem.Observers.NotificationObservable;
import NotificationSystem.Strategies.EmailStrategy;
import NotificationSystem.Strategies.SmsStrategy;

public class Client {
    public static void main(String[] args) {

        NotificationManager notificationManager = NotificationManager.getInstance();
        NotificationObservable notificationObservable=NotificationManager.getInstance().getObservable();

        NotificationEngine notificationEngine = new NotificationEngine(notificationObservable);
        notificationEngine.addStrategy(new EmailStrategy("somveerdahiya009@gmail.com"));
        notificationEngine.addStrategy(new SmsStrategy("8447771990"));

        notificationObservable.addObserver(notificationEngine);

        INotification notification =new TimeStampDecorator(new SimpleNotification("--Ordered Successfully--"));
        notificationObservable.setNotification(notification);
    }
}

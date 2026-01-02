package NotificationSystem.Decorators;

public class TimeStampDecorator implements INotificationDecorator {
    private INotification notification ;
    public TimeStampDecorator(INotification notification){
        this.notification=notification ;
    }
    @Override
    public String getContent() {
        return notification.getContent()+"[2026-02-01 14:22:00]"; //Static Timestamp
    }
}

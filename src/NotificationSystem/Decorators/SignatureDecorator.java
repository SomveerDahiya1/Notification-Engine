package NotificationSystem.Decorators;

public class SignatureDecorator implements INotificationDecorator {
    private INotification notification ;
    private String sign ;
    SignatureDecorator(INotification notification,String sign){
        this.notification=notification ;
        this.sign=sign ;
    }
    @Override
    public String getContent() {
        return notification.getContent()+"/n --"+sign+"-- /n";
    }
}

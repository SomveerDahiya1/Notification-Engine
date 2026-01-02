package NotificationSystem.Strategies;

public class EmailStrategy implements INotificationStrategy {
    private String mail ;
    public EmailStrategy(String mail){
        this.mail=mail ;
    }
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending Mail notification to "+mail+content);
    }
}

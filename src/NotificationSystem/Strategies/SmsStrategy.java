package NotificationSystem.Strategies;

public class SmsStrategy implements INotificationStrategy {
    private String mobileNo ;
    public SmsStrategy(String mobileNo){
        this.mobileNo=mobileNo;
    }
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending SMS notification : "+mobileNo+content);
    }
}

package NotificationSystem.Decorators;

public class SimpleNotification implements INotification {
    private String msg ;
    public SimpleNotification(String msg){
        this.msg=msg ;
    }
    @Override
    public String getContent() {
        return msg;
    }
}

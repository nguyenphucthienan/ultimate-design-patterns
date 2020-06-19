package facade;

public class NotificationService {

    public void send(String message, String target) {
        NotificationServer notificationServer = new NotificationServer();
        Connection connection = notificationServer.connect("ipAddress");
        AuthToken authToken = notificationServer.authenticate("appId", "key");
        notificationServer.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}

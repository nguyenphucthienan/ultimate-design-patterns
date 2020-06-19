package chainofresponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authentication");
        boolean isValid = request.getUsername().equals("admin") && request.getPassword().equals("password");
        return !isValid;
    }
}

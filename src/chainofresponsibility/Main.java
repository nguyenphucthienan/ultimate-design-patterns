package chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        // Authenticator -> Logger -> Compressor -> Encryptor
        Encryptor encryptor = new Encryptor(null);
        Compressor compressor = new Compressor(encryptor);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "password"));
    }
}

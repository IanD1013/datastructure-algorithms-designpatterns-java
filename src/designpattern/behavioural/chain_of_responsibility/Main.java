package designpattern.behavioural.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        // authenticator -> logger -> compressor, build last first
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);

        server.handle(new HttpRequest("admin", "1234"));
    }
}

package designpattern.behavioural.strategy.exercise_chat_client;

public class Main {
    public static void main(String[] args) {
        var client = new ChatClient(new DES());
        client.send("Hello World");
    }
}

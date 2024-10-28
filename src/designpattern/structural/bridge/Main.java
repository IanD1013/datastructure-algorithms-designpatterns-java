package designpattern.structural.bridge;

public class Main {
    public static void main(String[] args) {
        var remoteControl1 = new RemoteControl(new SamSungTV());
        var remoteControl2 = new AdvancedRemoteControl(new SamSungTV());
        remoteControl1.turnOn();
        remoteControl2.turnOn();
    }
}

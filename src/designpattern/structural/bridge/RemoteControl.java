package designpattern.structural.bridge;

// Basic Remote Control (turnOn, turnOff)
// Advanced Remote Control (setChannel)
// Movie Remote Control (play, pause, rewind)

// RemoteControl
//   SonyRemoteControl <-
//   AdvancedRemoteControl
//     SonyAdvancedRemoteControl <-

// RemoteControl
//   SonyRemoteControl
//   SamsungRemoteControl <-
//   AdvancedRemoteControl
//     SonyAdvancedRemoteControl
//     SamsungAdvancedRemoteControl <-
// 2 types of remote controls -> 2 new classes

// public abstract class RemoteControl {
//    public abstract void turnOn();
//
//    public abstract void turnOff();
// }

public class RemoteControl {
    protected Device device; // bridge

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}
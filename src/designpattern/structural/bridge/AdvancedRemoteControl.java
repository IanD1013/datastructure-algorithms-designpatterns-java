package designpattern.structural.bridge;

//public abstract class AdvancedRemoteControl extends RemoteControl {
//    public abstract void setChannel(int number);
//}

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number) {
        device.setChannel(number);
    }
}

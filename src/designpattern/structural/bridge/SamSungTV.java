package designpattern.structural.bridge;

public class SamSungTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Samsung turn on");
    }
    @Override
    public void turnOff() {
        System.out.println("Samsung turn off");
    }
    @Override
    public void setChannel(int number) {
        System.out.println("Samsung set channel");
    }
}

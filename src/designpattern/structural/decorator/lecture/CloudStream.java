package designpattern.structural.decorator.lecture;

// Basic concrete implementation of the Stream interface
public class CloudStream implements Stream {
    public void write(String data) {
        System.out.println("Storing " + data);
    }
}

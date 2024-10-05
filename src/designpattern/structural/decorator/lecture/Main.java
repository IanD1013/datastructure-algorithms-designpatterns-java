package designpattern.structural.decorator.lecture;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new EncryptedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}

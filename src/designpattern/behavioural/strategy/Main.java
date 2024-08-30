package designpattern.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
//        var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
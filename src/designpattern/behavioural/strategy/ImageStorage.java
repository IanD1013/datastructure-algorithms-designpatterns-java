package designpattern.behavioural.strategy;

public class ImageStorage {
//    private Compressor compressor;
//    private Filter filter;

//    public ImageStorage(Compressor compressor, Filter filter) {
//        this.filter = filter;
//        this.compressor = compressor;
//    }

    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}

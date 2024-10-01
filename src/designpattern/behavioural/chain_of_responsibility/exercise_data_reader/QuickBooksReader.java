package designpattern.behavioural.chain_of_responsibility.exercise_data_reader;

public class QuickBooksReader extends DataReader {
    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a QuickBooks file.");
    }
}

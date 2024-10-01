package designpattern.behavioural.chain_of_responsibility.exercise_data_reader;

/**
 * As part of building an accounting application, we need to allow the user
 * to import data in a variety of formats such as:
 * - Excel spreadsheets (Windows)
 * - Number spreadsheets (Mac)
 * - QuickBook workbooks (special accounting software)
 * In the future, we may need to support other data formats
 */

public abstract class DataReader {
    private DataReader next;

    public void setNext(DataReader next) {
        this.next = next;
    }

    public void read(String fileName) {
        if (fileName.endsWith(getExtension())) {
            this.doRead(fileName);
            return;
        }

        if (next != null)
            next.read(fileName);
        else
            throw new UnsupportedOperationException("File format not supported.");
    }

    protected abstract String getExtension();

    protected abstract void doRead(String fileName);
}


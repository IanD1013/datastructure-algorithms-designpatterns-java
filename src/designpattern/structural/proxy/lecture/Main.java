package designpattern.structural.proxy.lecture;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames)
            library.add(new EbookProxy(fileName)); // for each file load an ebook and add to our library

        library.openEbook("a"); // simulate user double-click on an ebook to open it
    }
}

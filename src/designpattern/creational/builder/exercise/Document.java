package designpattern.creational.builder.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * You are building a word processor similar to Word. The user can add
 * text or image elements to a document and then export it to a variety
 * of different formats such as HTML, text, and so on.
 *
 * Note that if the selected format is HTML, all text and image elements
 * are written to an HTML document. If the selected format is text, however,
 * only text elements are written to a text file.
 *
 * Refactor this design using the builder pattern.
 */

public class Document {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void export(DocumentBuilder builder, String fileName) throws IOException {
        // Note that we've separated the construction of the target
        // document from its representation. The same construction
        // algorithm is used to generate different types of documents
        // such as HTML, text, etc.
        //
        // For text files, even though we don't have images, we still
        // use the same algorithm. Look at the implementation of
        // addImage() method in TextDocumentBuilder. It's empty. So it
        // simply ignores adding images.
        for (Element element: elements) {
            if (element instanceof Text)
                builder.addText((Text)element);
            else if (element instanceof Image)
                builder.addImage((Image)element);
        }

        var writer = new FileWriter(fileName);
        writer.write(builder.getResult());
        writer.close();
    }
}

package designpattern.creational.builder.exercise;

public interface DocumentBuilder {
    void addText(Text text);
    void addImage(Image image);
    String getResult();
}
package designpattern.behavioural.iterator.exercise_product_collection;

public interface Iterator {
    boolean hasNext();
    Product current();
    void next();
}
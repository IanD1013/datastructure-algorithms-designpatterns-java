package designpattern.behavioural.iterator.exercise_product_collection;

import java.util.ArrayList;
import java.util.List;

/**
 * This class only allows us to add a product to a collection. Once we
 * add a bunch of products to a collection, there is no way to iterate
 * that collection and print the products. Implement this feature using
 * the iterator pattern.
 */

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator {
        private ProductCollection collection;
        private int index;

        public ListIterator(ProductCollection collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return (index < collection.products.size());
        }

        @Override
        public Product current() {
            return collection.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}

package designpattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    // note: getUrls() method removed!!!

    public Iterator createIterator() { // programming to an interface
        return new ListIterator(this);
    }

    //========================================================
    private class ListIterator implements Iterator {
        private BrowseHistory history; // a history object that gonna iterate over
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size()); // inner class so can access urls private field
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
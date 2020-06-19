package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private final List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String> {

        private final BrowseHistory browseHistory;
        private int index = 0;

        public ListIterator(BrowseHistory browseHistory) {
            this.browseHistory = browseHistory;
        }

        @Override
        public boolean hasNext() {
            return index < browseHistory.urls.size();
        }

        @Override
        public String current() {
            return browseHistory.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

    // private final String[] urls = new String[10];
    // private int count = 0;
    //
    // public void push(String url) {
    //     urls[count++] = url;
    // }
    //
    // public String pop() {
    //     return urls[--count];
    // }
    //
    // public Iterator<String> createIterator() {
    //     return new BrowseHistory2.ArrayIterator(this);
    // }
    //
    // public class ArrayIterator implements Iterator<String> {
    //
    //     private final BrowseHistory2 browseHistory;
    //     private int index = 0;
    //
    //     public ArrayIterator(BrowseHistory2 browseHistory) {
    //         this.browseHistory = browseHistory;
    //     }
    //
    //     @Override
    //     public boolean hasNext() {
    //         return index < browseHistory.count;
    //     }
    //
    //     @Override
    //     public String current() {
    //         return browseHistory.urls[index];
    //     }
    //
    //     @Override
    //     public void next() {
    //         index++;
    //     }
    // }
}

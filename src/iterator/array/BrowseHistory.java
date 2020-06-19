package iterator.array;

public class BrowseHistory {

    private final String[] urls = new String[10];
    private int count = 0;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator<String> createIterator() {
        return new BrowseHistory.ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator<String> {

        private final BrowseHistory browseHistory;
        private int index = 0;

        public ArrayIterator(BrowseHistory browseHistory) {
            this.browseHistory = browseHistory;
        }

        @Override
        public boolean hasNext() {
            return index < browseHistory.count;
        }

        @Override
        public String current() {
            return browseHistory.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}

package iterator.list;

public interface Iterator<T> {

    boolean hasNext();

    T current();

    void next();
}

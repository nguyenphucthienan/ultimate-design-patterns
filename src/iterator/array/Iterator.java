package iterator.array;

public interface Iterator<T> {

    boolean hasNext();

    T current();

    void next();
}

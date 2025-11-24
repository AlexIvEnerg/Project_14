import java.util.Iterator;

public class ArrayIter<T> implements Iterable<T> {

    T[] array;
    public ArrayIter(T[] array) {
        this.array = array;
    }

    public Iterator<T> iterator() {
        return new ArrIterator<>(this);
    }
}

 class ArrIterator<T> implements Iterator<T> {

    int currElem = 0;
    ArrayIter<T> arrayIter;
    public ArrIterator(ArrayIter<T> arrayIter) {
        this.arrayIter = arrayIter;
    }

    @Override
    public boolean hasNext() { return currElem < 4; }

    @Override
    public T next() {
        return arrayIter.array[currElem++] ;
    }
}


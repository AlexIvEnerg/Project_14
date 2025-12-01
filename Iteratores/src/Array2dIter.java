import java.util.Iterator;

public class Array2dIter<T> implements Iterable<T> {

    T[][] array2d;
    Array2dIter(T[][] array2d) {
        this.array2d = array2d;
    }

    public Iterator<T> iterator() {
        return new Arr2dIterator<>(this);
    }
}

class Arr2dIterator<T> implements Iterator<T> {

    Array2dIter<T> array2dIter;
    int leng;
    Arr2dIterator(Array2dIter<T> array2dIter) {
        this.array2dIter = array2dIter;
        leng = array2dIter.array2d.length * array2dIter.array2d[0].length;
    }
    int currElem = 0;

    @Override
    public boolean hasNext() { return currElem < leng; }

    @Override
    public T next() {
        int cur = currElem;
        currElem ++;
        if (cur < leng/2) return array2dIter.array2d[0][cur] ;
        else {
            int ind = cur - leng/2;
            return array2dIter.array2d[1][ind];
        }
    }
}

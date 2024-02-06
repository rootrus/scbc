package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.getId  reason: case insensitive filesystem */
public abstract class C10825getId<T> implements Iterator<T> {
    public abstract T read();

    public void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }

    public final T next() {
        if (hasNext()) {
            return read();
        }
        throw new NoSuchElementException();
    }
}

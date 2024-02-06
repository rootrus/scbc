package p040o;

import java.util.Iterator;

/* renamed from: o.getEnterTransition */
public final class getEnterTransition<T> implements Iterator<T> {
    private Iterator<? extends T> IconCompatParcelizer;
    private final Iterable<? extends T> read;

    public getEnterTransition(Iterable<? extends T> iterable) {
        this.read = iterable;
    }

    public final boolean hasNext() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = this.read.iterator();
        }
        return this.IconCompatParcelizer.hasNext();
    }

    public final T next() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = this.read.iterator();
        }
        return this.IconCompatParcelizer.next();
    }

    public final void remove() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = this.read.iterator();
        }
        this.IconCompatParcelizer.remove();
    }
}

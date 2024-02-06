package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.MerchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
public class C10417xf35bd475<T> implements Iterator<T> {
    private final T[] MediaBrowserCompat$CustomActionResultReceiver;
    private int read = 0;

    public C10417xf35bd475(T[] tArr) {
        this.MediaBrowserCompat$CustomActionResultReceiver = tArr;
    }

    public final boolean hasNext() {
        return this.read < this.MediaBrowserCompat$CustomActionResultReceiver.length;
    }

    public final T next() {
        int i = this.read;
        T[] tArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i != tArr.length) {
            this.read = i + 1;
            return tArr[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Out of elements: ");
        sb.append(this.read);
        throw new NoSuchElementException(sb.toString());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}

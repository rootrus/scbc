package p040o;

import java.util.Iterator;

/* renamed from: o.DebitWithdrawalLimitActivity */
public final class DebitWithdrawalLimitActivity<T> implements Iterable<T> {
    private final Iterable<T> MediaBrowserCompat$ItemReceiver;

    private DebitWithdrawalLimitActivity(Iterable<T> iterable) {
        this.MediaBrowserCompat$ItemReceiver = iterable;
    }

    public final Iterator<T> iterator() {
        return this.MediaBrowserCompat$ItemReceiver.iterator();
    }

    public static <T> DebitWithdrawalLimitActivity<T> MediaBrowserCompat$CustomActionResultReceiver(Iterable<T> iterable) {
        return new DebitWithdrawalLimitActivity<>(iterable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Iterable<T> iterable = this.MediaBrowserCompat$ItemReceiver;
        Iterable<T> iterable2 = ((DebitWithdrawalLimitActivity) obj).MediaBrowserCompat$ItemReceiver;
        if (iterable != null) {
            if (iterable.equals(iterable2)) {
                return true;
            }
        } else if (iterable2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterable<T> iterable = this.MediaBrowserCompat$ItemReceiver;
        if (iterable != null) {
            return iterable.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.MediaBrowserCompat$ItemReceiver.toString();
    }
}

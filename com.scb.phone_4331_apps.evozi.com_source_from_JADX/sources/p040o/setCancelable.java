package p040o;

import java.util.Collections;
import java.util.Comparator;

/* renamed from: o.setCancelable */
public final class setCancelable<T> implements Comparator<T> {
    /* access modifiers changed from: private */
    public final Comparator<? super T> MediaBrowserCompat$ItemReceiver;

    static {
        new setCancelable(new Comparator<Comparable<Object>>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        });
        new setCancelable(Collections.reverseOrder());
    }

    public static <T, U extends Comparable<? super U>> setCancelable<T> write(final findFragmentByWho<? super T, ? extends U> findfragmentbywho) {
        return new setCancelable<>(new Comparator<T>() {
            public final int compare(T t, T t2) {
                return ((Comparable) findfragmentbywho.IconCompatParcelizer(t)).compareTo((Comparable) findfragmentbywho.IconCompatParcelizer(t2));
            }
        });
    }

    private setCancelable(Comparator<? super T> comparator) {
        this.MediaBrowserCompat$ItemReceiver = comparator;
    }

    public final int compare(T t, T t2) {
        return this.MediaBrowserCompat$ItemReceiver.compare(t, t2);
    }

    public final /* synthetic */ Comparator reversed() {
        return new setCancelable(Collections.reverseOrder(this.MediaBrowserCompat$ItemReceiver));
    }

    public final /* synthetic */ Comparator thenComparing(final Comparator comparator) {
        return new setCancelable(new Comparator<T>() {
            public final int compare(T t, T t2) {
                int compare = setCancelable.this.MediaBrowserCompat$ItemReceiver.compare(t, t2);
                return compare == 0 ? comparator.compare(t, t2) : compare;
            }
        });
    }
}

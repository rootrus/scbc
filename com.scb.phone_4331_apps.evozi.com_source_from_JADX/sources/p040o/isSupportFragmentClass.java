package p040o;

/* renamed from: o.isSupportFragmentClass */
public final class isSupportFragmentClass<T> {
    private static final isSupportFragmentClass<?> MediaBrowserCompat$CustomActionResultReceiver = new isSupportFragmentClass<>();
    public final T IconCompatParcelizer;

    public static <T> isSupportFragmentClass<T> read(T t) {
        return new isSupportFragmentClass<>(t);
    }

    public static <T> isSupportFragmentClass<T> MediaBrowserCompat$CustomActionResultReceiver() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    private isSupportFragmentClass() {
        this.IconCompatParcelizer = null;
    }

    private isSupportFragmentClass(T t) {
        if (t != null) {
            this.IconCompatParcelizer = t;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isSupportFragmentClass)) {
            return false;
        }
        T t = this.IconCompatParcelizer;
        T t2 = ((isSupportFragmentClass) obj).IconCompatParcelizer;
        if (t == t2) {
            return true;
        }
        if (t == null || !t.equals(t2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        T t = this.IconCompatParcelizer;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public final String toString() {
        T t = this.IconCompatParcelizer;
        if (t == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{t});
    }

    public static <T> isSupportFragmentClass<T> MediaBrowserCompat$ItemReceiver(T t) {
        if (t == null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        return new isSupportFragmentClass<>(t);
    }

    public final <U> isSupportFragmentClass<U> MediaBrowserCompat$ItemReceiver(findFragmentByWho<? super T, ? extends U> findfragmentbywho) {
        if (!(this.IconCompatParcelizer != null)) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        Object IconCompatParcelizer2 = findfragmentbywho.IconCompatParcelizer(this.IconCompatParcelizer);
        if (IconCompatParcelizer2 == null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        return new isSupportFragmentClass<>(IconCompatParcelizer2);
    }
}

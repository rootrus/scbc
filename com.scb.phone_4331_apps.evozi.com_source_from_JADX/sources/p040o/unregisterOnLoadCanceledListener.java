package p040o;

/* renamed from: o.unregisterOnLoadCanceledListener */
public final class unregisterOnLoadCanceledListener<K, V> extends setTextAppearance<K, V> {
    private int IconCompatParcelizer;

    public final void clear() {
        this.IconCompatParcelizer = 0;
        super.clear();
    }

    public final V read(int i, V v) {
        this.IconCompatParcelizer = 0;
        return super.read(i, v);
    }

    public final V put(K k, V v) {
        this.IconCompatParcelizer = 0;
        return super.put(k, v);
    }

    public final void MediaBrowserCompat$ItemReceiver(AppCompatCheckBox<? extends K, ? extends V> appCompatCheckBox) {
        this.IconCompatParcelizer = 0;
        super.MediaBrowserCompat$ItemReceiver(appCompatCheckBox);
    }

    public final V write(int i) {
        this.IconCompatParcelizer = 0;
        return super.write(i);
    }

    public final int hashCode() {
        if (this.IconCompatParcelizer == 0) {
            this.IconCompatParcelizer = super.hashCode();
        }
        return this.IconCompatParcelizer;
    }
}

package p040o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p040o.setSupportButtonTintList;

/* renamed from: o.setTextAppearance */
public class setTextAppearance<K, V> extends AppCompatCheckBox<K, V> implements Map<K, V> {
    private setSupportButtonTintList<K, V> write;

    public setTextAppearance() {
    }

    public setTextAppearance(int i) {
        super(i);
    }

    public setTextAppearance(AppCompatCheckBox appCompatCheckBox) {
        super(appCompatCheckBox);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        read(this.MediaBrowserCompat$CustomActionResultReceiver + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.write == null) {
            this.write = new setSupportButtonTintList<K, V>() {
                /* access modifiers changed from: protected */
                public final int MediaBrowserCompat$CustomActionResultReceiver() {
                    return setTextAppearance.this.MediaBrowserCompat$CustomActionResultReceiver;
                }

                /* access modifiers changed from: protected */
                public final Object read(int i, int i2) {
                    return setTextAppearance.this.read[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                public final int IconCompatParcelizer(Object obj) {
                    setTextAppearance settextappearance = setTextAppearance.this;
                    return obj == null ? settextappearance.IconCompatParcelizer() : settextappearance.read(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                public final int MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
                    return setTextAppearance.this.write(obj);
                }

                /* access modifiers changed from: protected */
                public final Map<K, V> MediaBrowserCompat$ItemReceiver() {
                    return setTextAppearance.this;
                }

                /* access modifiers changed from: protected */
                public final void MediaBrowserCompat$CustomActionResultReceiver(K k, V v) {
                    setTextAppearance.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                public final V MediaBrowserCompat$CustomActionResultReceiver(int i, V v) {
                    return setTextAppearance.this.read(i, v);
                }

                /* access modifiers changed from: protected */
                public final void read(int i) {
                    setTextAppearance.this.write(i);
                }

                /* access modifiers changed from: protected */
                public final void read() {
                    setTextAppearance.this.clear();
                }
            };
        }
        setSupportButtonTintList<K, V> setsupportbuttontintlist = this.write;
        if (setsupportbuttontintlist.MediaBrowserCompat$CustomActionResultReceiver == null) {
            setsupportbuttontintlist.MediaBrowserCompat$CustomActionResultReceiver = new setSupportButtonTintList.read();
        }
        return setsupportbuttontintlist.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public Set<K> keySet() {
        if (this.write == null) {
            this.write = new setSupportButtonTintList<K, V>() {
                /* access modifiers changed from: protected */
                public final int MediaBrowserCompat$CustomActionResultReceiver() {
                    return setTextAppearance.this.MediaBrowserCompat$CustomActionResultReceiver;
                }

                /* access modifiers changed from: protected */
                public final Object read(int i, int i2) {
                    return setTextAppearance.this.read[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                public final int IconCompatParcelizer(Object obj) {
                    setTextAppearance settextappearance = setTextAppearance.this;
                    return obj == null ? settextappearance.IconCompatParcelizer() : settextappearance.read(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                public final int MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
                    return setTextAppearance.this.write(obj);
                }

                /* access modifiers changed from: protected */
                public final Map<K, V> MediaBrowserCompat$ItemReceiver() {
                    return setTextAppearance.this;
                }

                /* access modifiers changed from: protected */
                public final void MediaBrowserCompat$CustomActionResultReceiver(K k, V v) {
                    setTextAppearance.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                public final V MediaBrowserCompat$CustomActionResultReceiver(int i, V v) {
                    return setTextAppearance.this.read(i, v);
                }

                /* access modifiers changed from: protected */
                public final void read(int i) {
                    setTextAppearance.this.write(i);
                }

                /* access modifiers changed from: protected */
                public final void read() {
                    setTextAppearance.this.clear();
                }
            };
        }
        setSupportButtonTintList<K, V> setsupportbuttontintlist = this.write;
        if (setsupportbuttontintlist.IconCompatParcelizer == null) {
            setsupportbuttontintlist.IconCompatParcelizer = new setSupportButtonTintList$MediaBrowserCompat$ItemReceiver(setsupportbuttontintlist);
        }
        return setsupportbuttontintlist.IconCompatParcelizer;
    }

    public Collection<V> values() {
        if (this.write == null) {
            this.write = new setSupportButtonTintList<K, V>() {
                /* access modifiers changed from: protected */
                public final int MediaBrowserCompat$CustomActionResultReceiver() {
                    return setTextAppearance.this.MediaBrowserCompat$CustomActionResultReceiver;
                }

                /* access modifiers changed from: protected */
                public final Object read(int i, int i2) {
                    return setTextAppearance.this.read[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                public final int IconCompatParcelizer(Object obj) {
                    setTextAppearance settextappearance = setTextAppearance.this;
                    return obj == null ? settextappearance.IconCompatParcelizer() : settextappearance.read(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                public final int MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
                    return setTextAppearance.this.write(obj);
                }

                /* access modifiers changed from: protected */
                public final Map<K, V> MediaBrowserCompat$ItemReceiver() {
                    return setTextAppearance.this;
                }

                /* access modifiers changed from: protected */
                public final void MediaBrowserCompat$CustomActionResultReceiver(K k, V v) {
                    setTextAppearance.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                public final V MediaBrowserCompat$CustomActionResultReceiver(int i, V v) {
                    return setTextAppearance.this.read(i, v);
                }

                /* access modifiers changed from: protected */
                public final void read(int i) {
                    setTextAppearance.this.write(i);
                }

                /* access modifiers changed from: protected */
                public final void read() {
                    setTextAppearance.this.clear();
                }
            };
        }
        setSupportButtonTintList<K, V> setsupportbuttontintlist = this.write;
        if (setsupportbuttontintlist.MediaBrowserCompat$ItemReceiver == null) {
            setsupportbuttontintlist.MediaBrowserCompat$ItemReceiver = new C1548xcb723485(setsupportbuttontintlist);
        }
        return setsupportbuttontintlist.MediaBrowserCompat$ItemReceiver;
    }
}

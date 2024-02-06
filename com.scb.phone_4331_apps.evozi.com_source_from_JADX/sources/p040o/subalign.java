package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.subalign$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.subalign */
public class subalign<T extends subalign$MediaBrowserCompat$ItemReceiver> {
    private static int MediaBrowserCompat$ItemReceiver;
    private int IconCompatParcelizer;
    private T MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$MediaItem;
    private int MediaMetadataCompat;
    float read;
    private Object[] write;

    public static subalign read(int i, subalign$MediaBrowserCompat$ItemReceiver subalign_mediabrowsercompat_itemreceiver) {
        subalign subalign;
        synchronized (subalign.class) {
            subalign = new subalign(i, subalign_mediabrowsercompat_itemreceiver);
            subalign.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver;
            MediaBrowserCompat$ItemReceiver++;
        }
        return subalign;
    }

    private subalign(int i, T t) {
        if (i > 0) {
            this.IconCompatParcelizer = i;
            this.write = new Object[i];
            this.MediaMetadataCompat = 0;
            this.MediaBrowserCompat$CustomActionResultReceiver = t;
            this.read = 1.0f;
            write(1.0f);
            return;
        }
        throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
    }

    private void write(float f) {
        int i = this.IconCompatParcelizer;
        int i2 = (int) (((float) i) * f);
        if (i2 <= 0) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.write[i3] = this.MediaBrowserCompat$CustomActionResultReceiver.read();
        }
        this.MediaMetadataCompat = i - 1;
    }

    public final T IconCompatParcelizer() {
        T t;
        synchronized (this) {
            if (this.MediaMetadataCompat == -1 && this.read > BitmapDescriptorFactory.HUE_RED) {
                write(this.read);
            }
            t = (subalign$MediaBrowserCompat$ItemReceiver) this.write[this.MediaMetadataCompat];
            t.read = -1;
            this.MediaMetadataCompat--;
        }
        return t;
    }

    public final void IconCompatParcelizer(T t) {
        synchronized (this) {
            if (t.read == -1) {
                int i = this.MediaMetadataCompat + 1;
                this.MediaMetadataCompat = i;
                if (i >= this.write.length) {
                    MediaBrowserCompat$ItemReceiver();
                }
                t.read = this.MediaBrowserCompat$MediaItem;
                this.write[this.MediaMetadataCompat] = t;
            } else if (t.read == this.MediaBrowserCompat$MediaItem) {
                throw new IllegalArgumentException("The object passed is already stored in this pool!");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("The object to recycle already belongs to poolId ");
                sb.append(t.read);
                sb.append(".  Object cannot belong to two different pool instances simultaneously!");
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver() {
        int i = this.IconCompatParcelizer;
        int i2 = i << 1;
        this.IconCompatParcelizer = i2;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = this.write[i3];
        }
        this.write = objArr;
    }
}

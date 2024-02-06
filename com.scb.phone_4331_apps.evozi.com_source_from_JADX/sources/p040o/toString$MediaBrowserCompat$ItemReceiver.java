package p040o;

import android.os.Bundle;
import android.os.Looper;
import p040o.size;
import p040o.sizeOf;
import p040o.toString;

/* renamed from: o.toString$MediaBrowserCompat$ItemReceiver */
public class toString$MediaBrowserCompat$ItemReceiver<D> extends remove<D> implements size.write<D> {
    final int MediaBrowserCompat$MediaItem;
    final size<D> MediaBrowserCompat$SearchResultReceiver;
    toString.read<D> MediaDescriptionCompat;
    private maxSize MediaMetadataCompat;
    private size<D> MediaSessionCompat$ResultReceiverWrapper = null;
    final Bundle RatingCompat;

    toString$MediaBrowserCompat$ItemReceiver(int i, Bundle bundle, size<D> size, size<D> size2) {
        this.MediaBrowserCompat$MediaItem = i;
        this.RatingCompat = bundle;
        this.MediaBrowserCompat$SearchResultReceiver = size;
        size.registerListener(i, this);
    }

    public final void write() {
        boolean z = toString.read;
        this.MediaBrowserCompat$SearchResultReceiver.startLoading();
    }

    public final void read() {
        boolean z = toString.read;
        this.MediaBrowserCompat$SearchResultReceiver.stopLoading();
    }

    /* access modifiers changed from: package-private */
    public final size<D> IconCompatParcelizer(maxSize maxsize, sizeOf.IconCompatParcelizer<D> iconCompatParcelizer) {
        toString.read<D> read = new toString.read<>(this.MediaBrowserCompat$SearchResultReceiver, iconCompatParcelizer);
        MediaBrowserCompat$ItemReceiver(maxsize, read);
        toString.read<D> read2 = this.MediaDescriptionCompat;
        if (read2 != null) {
            super.write(read2);
            this.MediaMetadataCompat = null;
            this.MediaDescriptionCompat = null;
        }
        this.MediaMetadataCompat = maxsize;
        this.MediaDescriptionCompat = read;
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        maxSize maxsize = this.MediaMetadataCompat;
        toString.read<D> read = this.MediaDescriptionCompat;
        if (maxsize != null && read != null) {
            super.write(read);
            MediaBrowserCompat$ItemReceiver(maxsize, read);
        }
    }

    public final void write(putCount<? super D> putcount) {
        super.write(putcount);
        this.MediaMetadataCompat = null;
        this.MediaDescriptionCompat = null;
    }

    /* access modifiers changed from: package-private */
    public final size<D> MediaBrowserCompat$ItemReceiver() {
        boolean z = toString.read;
        this.MediaBrowserCompat$SearchResultReceiver.cancelLoad();
        this.MediaBrowserCompat$SearchResultReceiver.abandon();
        toString.read<D> read = this.MediaDescriptionCompat;
        if (read != null) {
            super.write(read);
            this.MediaMetadataCompat = null;
            this.MediaDescriptionCompat = null;
            if (read.write) {
                boolean z2 = toString.read;
                read.IconCompatParcelizer.onLoaderReset(read.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
        this.MediaBrowserCompat$SearchResultReceiver.unregisterListener(this);
        this.MediaBrowserCompat$SearchResultReceiver.reset();
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public final void IconCompatParcelizer(size<D> size, D d) {
        boolean z = toString.read;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            super.MediaBrowserCompat$CustomActionResultReceiver(d);
            size<D> size2 = this.MediaSessionCompat$ResultReceiverWrapper;
            if (size2 != null) {
                size2.reset();
                this.MediaSessionCompat$ResultReceiverWrapper = null;
                return;
            }
            return;
        }
        boolean z2 = toString.read;
        IconCompatParcelizer(d);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(D d) {
        super.MediaBrowserCompat$CustomActionResultReceiver(d);
        size<D> size = this.MediaSessionCompat$ResultReceiverWrapper;
        if (size != null) {
            size.reset();
            this.MediaSessionCompat$ResultReceiverWrapper = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(" : ");
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, sb);
        sb.append("}}");
        return sb.toString();
    }
}

package p040o;

import android.widget.ImageView;

/* renamed from: o.zzca$zze$zza$read$MediaBrowserCompat$CustomActionResultReceiver */
public final class zzca$zze$zza$read$MediaBrowserCompat$CustomActionResultReceiver implements IdExtractor_Factory {
    private final getSupportLoaderManager MediaBrowserCompat$CustomActionResultReceiver;
    private final hashCode read;

    private zzca$zze$zza$read$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public zzca$zze$zza$read$MediaBrowserCompat$CustomActionResultReceiver(hashCode hashcode, getSupportLoaderManager getsupportloadermanager) {
        this.read = hashcode;
        this.MediaBrowserCompat$CustomActionResultReceiver = getsupportloadermanager;
    }

    public final void write(Object obj, ImageView imageView) {
        this.read.load(obj).asBitmap().skipMemoryCache(true).diskCacheStrategy(performCreate.SOURCE).transform(new getSupportLoaderManager[]{this.MediaBrowserCompat$CustomActionResultReceiver}).into(imageView);
    }
}

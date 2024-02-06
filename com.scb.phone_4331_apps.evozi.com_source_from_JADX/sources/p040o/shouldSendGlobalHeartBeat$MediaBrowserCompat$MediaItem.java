package p040o;

import android.graphics.Bitmap;
import p040o.writeUInt64NoTag;

/* renamed from: o.shouldSendGlobalHeartBeat$MediaBrowserCompat$MediaItem */
public final class shouldSendGlobalHeartBeat$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver> {
    private /* synthetic */ Bitmap MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ shutdownNow MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String write;

    public shouldSendGlobalHeartBeat$MediaBrowserCompat$MediaItem(Bitmap bitmap, shutdownNow shutdownnow, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bitmap;
        this.MediaBrowserCompat$ItemReceiver = shutdownnow;
        this.write = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver cardIoWrapperActivity$MediaBrowserCompat$ItemReceiver = (CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver) obj;
        cardIoWrapperActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        cardIoWrapperActivity$MediaBrowserCompat$ItemReceiver.write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.read);
        cardIoWrapperActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
        String str = this.write;
        if (str != null) {
            cardIoWrapperActivity$MediaBrowserCompat$ItemReceiver.read(str);
        }
    }
}

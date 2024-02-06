package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setCropLineColor$MediaBrowserCompat$ItemReceiver */
public final class setCropLineColor$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<newPassportExtractor> {
    private /* synthetic */ setCropLineColor MediaBrowserCompat$CustomActionResultReceiver;

    public setCropLineColor$MediaBrowserCompat$ItemReceiver(setCropLineColor setcroplinecolor) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setcroplinecolor;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String str;
        newPassportExtractor newpassportextractor = (newPassportExtractor) obj;
        zzwi write = this.MediaBrowserCompat$CustomActionResultReceiver.read.write.MediaBrowserCompat$CustomActionResultReceiver.write();
        if (write != null) {
            str = write.PlaybackStateCompat;
        } else {
            str = null;
        }
        newpassportextractor.write(str);
    }
}

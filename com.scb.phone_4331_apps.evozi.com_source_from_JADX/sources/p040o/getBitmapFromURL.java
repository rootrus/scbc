package p040o;

import p040o.getCropTetragon;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBitmapFromURL */
public final /* synthetic */ class getBitmapFromURL implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCropTetragon.write read;

    public /* synthetic */ getBitmapFromURL(getCropTetragon.write write) {
        this.read = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver((getMicrAmount.RatingCompat) obj);
    }
}

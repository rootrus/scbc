package p040o;

import p040o.getCropTetragon;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.storeGlobalBitmap */
public final /* synthetic */ class storeGlobalBitmap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCropTetragon.read MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ storeGlobalBitmap(getCropTetragon.read read) {
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.write((getMicrAmount.RatingCompat) obj);
    }
}

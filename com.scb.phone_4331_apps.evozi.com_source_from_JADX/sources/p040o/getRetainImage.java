package p040o;

import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRetainImage */
public final /* synthetic */ class getRetainImage implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ getRetainImage MediaBrowserCompat$ItemReceiver = new getRetainImage();

    private /* synthetic */ getRetainImage() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getMicrAmount.RatingCompat) obj).read();
    }
}

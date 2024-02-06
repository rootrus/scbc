package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.inject */
public final /* synthetic */ class C4805inject implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4805inject(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4176cd.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, (KtaJsonCheck.RatingCompat) obj);
    }
}

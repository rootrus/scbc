package p040o;

import p040o.C4895kb;
import p040o.access$2300;
import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.jS */
public final /* synthetic */ class C4857jS implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C4895kb.RatingCompat write;

    public /* synthetic */ C4857jS(C4895kb.RatingCompat ratingCompat, Throwable th) {
        this.write = ratingCompat;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4895kb.RatingCompat ratingCompat = this.write;
        ((getCarbonStrip.IconCompatParcelizer) obj).write(C4895kb.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
    }
}

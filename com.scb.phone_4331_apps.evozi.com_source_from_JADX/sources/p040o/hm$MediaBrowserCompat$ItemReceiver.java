package p040o;

import p040o.OnDeviceIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.hm$MediaBrowserCompat$ItemReceiver */
public final class hm$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
    final /* synthetic */ C4775hm MediaBrowserCompat$CustomActionResultReceiver;

    public hm$MediaBrowserCompat$ItemReceiver(C4775hm hmVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        C4775hm hmVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.write>(this) {
            private /* synthetic */ hm$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                C4775hm.read(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                ((OnDeviceIdExtractor.write) obj).MediaDescriptionCompat();
            }
        };
        if (hmVar.RatingCompat != null) {
            r0.IconCompatParcelizer(hmVar.RatingCompat);
        }
    }
}

package p040o;

import p040o.OnDeviceIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.hm$MediaBrowserCompat$CustomActionResultReceiver */
public final class hm$MediaBrowserCompat$CustomActionResultReceiver<T> implements DebitCardMarketConductDeepLinkActivity<Object> {
    final /* synthetic */ C4775hm write;

    public hm$MediaBrowserCompat$CustomActionResultReceiver(C4775hm hmVar) {
        this.write = hmVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4775hm hmVar = this.write;
        writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.write>(this) {
            private /* synthetic */ hm$MediaBrowserCompat$CustomActionResultReceiver read;

            {
                this.read = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                C4775hm.read(this.read.write);
                ((OnDeviceIdExtractor.write) obj).IconCompatParcelizer();
            }
        };
        if (hmVar.RatingCompat != null) {
            r0.IconCompatParcelizer(hmVar.RatingCompat);
        }
    }
}

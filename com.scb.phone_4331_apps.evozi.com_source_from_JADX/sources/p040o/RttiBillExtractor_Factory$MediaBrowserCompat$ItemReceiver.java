package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.RttiBillExtractor_Factory$MediaBrowserCompat$ItemReceiver */
final class RttiBillExtractor_Factory$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
    private /* synthetic */ RttiBillExtractor_Factory MediaBrowserCompat$ItemReceiver;

    RttiBillExtractor_Factory$MediaBrowserCompat$ItemReceiver(RttiBillExtractor_Factory rttiBillExtractor_Factory) {
        this.MediaBrowserCompat$ItemReceiver = rttiBillExtractor_Factory;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver((Throwable) obj)) {
            RttiBillExtractor_Factory rttiBillExtractor_Factory = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C70371.MediaBrowserCompat$ItemReceiver;
            if (rttiBillExtractor_Factory.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(rttiBillExtractor_Factory.RatingCompat);
            }
        }
    }
}

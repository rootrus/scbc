package p040o;

/* renamed from: o.nativeaddRow */
public final class nativeaddRow implements OPRStatusRewardsLandingActivity_ViewBinding<nativeGetNumberOfRows> {
    private final HmlReviewDocumentActivity<RegularImmutableBiMap> MediaBrowserCompat$ItemReceiver;

    private nativeaddRow(HmlReviewDocumentActivity<RegularImmutableBiMap> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static nativeaddRow read(HmlReviewDocumentActivity<RegularImmutableBiMap> hmlReviewDocumentActivity) {
        return new nativeaddRow(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new nativeGetNumberOfRows(this.MediaBrowserCompat$ItemReceiver.get());
    }
}

package p040o;

import p040o.onSearchButtonClick;

/* renamed from: o.getApi */
public final class getApi implements OPRStatusRewardsLandingActivity_ViewBinding<getLooper> {
    private final HmlReviewDocumentActivity<onSearchButtonClick.read> read;

    private getApi(HmlReviewDocumentActivity<onSearchButtonClick.read> hmlReviewDocumentActivity) {
        this.read = hmlReviewDocumentActivity;
    }

    public static getApi MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<onSearchButtonClick.read> hmlReviewDocumentActivity) {
        return new getApi(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new getLooper(this.read.get());
    }
}

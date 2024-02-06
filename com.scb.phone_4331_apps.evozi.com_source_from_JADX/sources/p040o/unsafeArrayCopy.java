package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.unsafeArrayCopy */
public final class unsafeArrayCopy implements OPRStatusRewardsLandingActivity_ViewBinding<RegularImmutableBiMap> {
    private final HmlReviewDocumentActivity<Resources> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<SharedPreferences> MediaBrowserCompat$ItemReceiver;

    private unsafeArrayCopy(HmlReviewDocumentActivity<Resources> hmlReviewDocumentActivity, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
    }

    public static unsafeArrayCopy IconCompatParcelizer(HmlReviewDocumentActivity<Resources> hmlReviewDocumentActivity, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity2) {
        return new unsafeArrayCopy(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new RegularImmutableBiMap(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get());
    }
}

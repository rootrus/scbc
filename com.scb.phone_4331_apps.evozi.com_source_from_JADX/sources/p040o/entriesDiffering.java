package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.entriesDiffering */
public final class entriesDiffering implements OPRStatusRewardsLandingActivity_ViewBinding<entriesInCommon> {
    private final HmlReviewDocumentActivity<SharedPreferences> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<Resources> MediaBrowserCompat$ItemReceiver;

    private entriesDiffering(HmlReviewDocumentActivity<Resources> hmlReviewDocumentActivity, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static entriesDiffering MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<Resources> hmlReviewDocumentActivity, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity2) {
        return new entriesDiffering(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new entriesInCommon(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}

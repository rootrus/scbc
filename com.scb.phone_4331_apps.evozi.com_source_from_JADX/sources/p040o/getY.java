package p040o;

import android.content.SharedPreferences;

/* renamed from: o.getY */
public final class getY implements OPRStatusRewardsLandingActivity_ViewBinding<access$208$MediaBrowserCompat$ItemReceiver> {
    private final HmlReviewDocumentActivity<SharedPreferences> IconCompatParcelizer;

    private getY(HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static getY read(HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        return new getY(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new access$208$MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
    }
}

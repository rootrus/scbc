package p040o;

import android.content.SharedPreferences;

/* renamed from: o.setBlue */
public final class setBlue implements OPRStatusRewardsLandingActivity_ViewBinding<setBackingMap$MediaBrowserCompat$CustomActionResultReceiver> {
    private final HmlReviewDocumentActivity<SharedPreferences> MediaBrowserCompat$ItemReceiver;

    private setBlue(HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static setBlue write(HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        return new setBlue(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new setBackingMap$MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get());
    }
}

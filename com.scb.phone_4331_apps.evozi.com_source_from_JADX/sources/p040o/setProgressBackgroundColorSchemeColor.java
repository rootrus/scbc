package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.p033di.DataModule;
import p040o.createElementSet;

/* renamed from: o.setProgressBackgroundColorSchemeColor */
public final class setProgressBackgroundColorSchemeColor implements OPRStatusRewardsLandingActivity_ViewBinding<createElementSet.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<SharedPreferences> IconCompatParcelizer;
    private final DataModule MediaBrowserCompat$CustomActionResultReceiver;

    private setProgressBackgroundColorSchemeColor(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = dataModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static setProgressBackgroundColorSchemeColor MediaBrowserCompat$CustomActionResultReceiver(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        return new setProgressBackgroundColorSchemeColor(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        createElementSet.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

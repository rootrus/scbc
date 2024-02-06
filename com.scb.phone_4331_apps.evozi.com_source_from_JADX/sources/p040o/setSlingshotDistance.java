package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.p033di.DataModule;
import p040o.removeAllOccurrences;

/* renamed from: o.setSlingshotDistance */
public final class setSlingshotDistance implements OPRStatusRewardsLandingActivity_ViewBinding<removeAllOccurrences.write> {
    private final DataModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<SharedPreferences> write;

    private setSlingshotDistance(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = dataModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static setSlingshotDistance read(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        return new setSlingshotDistance(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        removeAllOccurrences.write IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.write.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

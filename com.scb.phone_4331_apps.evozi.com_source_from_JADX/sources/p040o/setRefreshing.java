package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setRefreshing */
public final class setRefreshing implements OPRStatusRewardsLandingActivity_ViewBinding<count$MediaBrowserCompat$CustomActionResultReceiver> {
    private final DataModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<SharedPreferences> write;

    private setRefreshing(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = dataModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static setRefreshing read(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        return new setRefreshing(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        count$MediaBrowserCompat$CustomActionResultReceiver read = this.IconCompatParcelizer.read(this.write.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

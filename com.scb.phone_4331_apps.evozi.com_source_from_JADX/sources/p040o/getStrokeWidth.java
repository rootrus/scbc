package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.p033di.DataModule;
import p040o.AbstractMultimap;

/* renamed from: o.getStrokeWidth */
public final class getStrokeWidth implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.write> {
    private final DataModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<SharedPreferences> write;

    private getStrokeWidth(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = dataModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static getStrokeWidth write(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        return new getStrokeWidth(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.write MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.write.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

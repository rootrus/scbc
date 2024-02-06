package p040o;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setSize */
public final class setSize implements OPRStatusRewardsLandingActivity_ViewBinding<Short3> {
    private final HmlReviewDocumentActivity<SharedPreferences> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<Gson> read;
    private final DataModule write;

    private setSize(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity2) {
        this.write = dataModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
    }

    public static setSize MediaBrowserCompat$ItemReceiver(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity2) {
        return new setSize(dataModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        Short3 MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setEnabled */
public final class setEnabled implements OPRStatusRewardsLandingActivity_ViewBinding<ScriptIntrinsicLUT> {
    private final DataModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<Gson> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<SharedPreferences> write;

    private setEnabled(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity2) {
        this.IconCompatParcelizer = dataModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static setEnabled IconCompatParcelizer(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity2) {
        return new setEnabled(dataModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        ScriptIntrinsicLUT write2 = this.IconCompatParcelizer.write(this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

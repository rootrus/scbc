package p040o;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.scb.phone.data.p033di.DataModule;
import p040o.notNull;

/* renamed from: o.getFillColor */
public final class getFillColor implements OPRStatusRewardsLandingActivity_ViewBinding<notNull.read> {
    private final HmlReviewDocumentActivity<Gson> IconCompatParcelizer;
    private final DataModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<SharedPreferences> MediaBrowserCompat$ItemReceiver;

    private getFillColor(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = dataModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
    }

    public static getFillColor MediaBrowserCompat$ItemReceiver(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity2) {
        return new getFillColor(dataModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        notNull.read IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

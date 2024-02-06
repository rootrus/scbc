package p040o;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.dataSetChanged */
public final class dataSetChanged implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.MultisetView> {
    private final HmlReviewDocumentActivity<Gson> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<SharedPreferences> read;
    private final RepositoryModule write;

    private dataSetChanged(RepositoryModule repositoryModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity2) {
        this.write = repositoryModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static dataSetChanged IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity2) {
        return new dataSetChanged(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.MultisetView write2 = this.write.write(this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

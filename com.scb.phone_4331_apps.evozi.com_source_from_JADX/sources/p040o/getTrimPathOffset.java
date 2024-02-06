package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.getTrimPathOffset */
public final class getTrimPathOffset implements OPRStatusRewardsLandingActivity_ViewBinding<getFrontException> {
    private final HmlReviewDocumentActivity<ScriptIntrinsicLUT> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getEnvCarrier$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<SharedPreferences> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<zaad> read;
    private final RepositoryModule write;

    private getTrimPathOffset(RepositoryModule repositoryModule, HmlReviewDocumentActivity<getEnvCarrier$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zaad> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ScriptIntrinsicLUT> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity5) {
        this.write = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
    }

    public static getTrimPathOffset MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<getEnvCarrier$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zaad> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ScriptIntrinsicLUT> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity5) {
        return new getTrimPathOffset(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        getFrontException read2 = this.write.read(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$MediaItem.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

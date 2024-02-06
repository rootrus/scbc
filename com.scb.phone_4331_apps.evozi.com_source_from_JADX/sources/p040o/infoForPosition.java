package p040o;

import android.content.res.AssetManager;
import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.infoForPosition */
public final class infoForPosition implements OPRStatusRewardsLandingActivity_ViewBinding<PassportExtractActivity> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<AssetManager> MediaBrowserCompat$ItemReceiver;

    private infoForPosition(RepositoryModule repositoryModule, HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static infoForPosition MediaBrowserCompat$CustomActionResultReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity) {
        return new infoForPosition(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PassportExtractActivity write = this.IconCompatParcelizer.write(this.MediaBrowserCompat$ItemReceiver.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import android.content.res.AssetManager;
import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.hasMipmaps */
public final class hasMipmaps implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindPreregistrationLandingFragment> {
    private final HmlReviewDocumentActivity<AssetManager> MediaBrowserCompat$ItemReceiver;
    private final DataModule write;

    private hasMipmaps(DataModule dataModule, HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity) {
        this.write = dataModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static hasMipmaps write(DataModule dataModule, HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity) {
        return new hasMipmaps(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindPreregistrationLandingFragment IconCompatParcelizer = this.write.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

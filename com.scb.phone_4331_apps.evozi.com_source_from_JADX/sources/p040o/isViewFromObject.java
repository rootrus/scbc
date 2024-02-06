package p040o;

import android.content.Context;
import android.content.res.Resources;
import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.isViewFromObject */
public final class isViewFromObject implements OPRStatusRewardsLandingActivity_ViewBinding<OnDeviceIdExtractor> {
    private final HmlReviewDocumentActivity<requestGoogleAccountsAccess> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidTravelServicesTabFragment> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<keys> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<Context> read;
    private final HmlReviewDocumentActivity<Resources> write;

    private isViewFromObject(RepositoryModule repositoryModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidTravelServicesTabFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<Resources> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<requestGoogleAccountsAccess> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
        this.IconCompatParcelizer = hmlReviewDocumentActivity5;
    }

    public static isViewFromObject write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidTravelServicesTabFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<Resources> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<requestGoogleAccountsAccess> hmlReviewDocumentActivity5) {
        return new isViewFromObject(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        OnDeviceIdExtractor read2 = this.MediaBrowserCompat$ItemReceiver.read(this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaDescriptionCompat.get(), this.write.get(), this.IconCompatParcelizer.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

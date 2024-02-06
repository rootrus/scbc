package p040o;

import com.scb.phone.data.network.api.justforyou.JustForYouApi;
import com.scb.phone.data.p033di.RepositoryModule;
import p040o.GoogleApiAvailability;

/* renamed from: o.ViewPager */
public final class ViewPager implements OPRStatusRewardsLandingActivity_ViewBinding<zzkg> {
    private final HmlReviewDocumentActivity<JustForYouApi> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindStatementChannelSuccessfulFragment> read;
    private final HmlReviewDocumentActivity<GoogleApiAvailability.zaa> write;

    private ViewPager(RepositoryModule repositoryModule, HmlReviewDocumentActivity<JustForYouApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<GoogleApiAvailability.zaa> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindStatementChannelSuccessfulFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
    }

    public static ViewPager read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<JustForYouApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<GoogleApiAvailability.zaa> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindStatementChannelSuccessfulFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity4) {
        return new ViewPager(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        zzkg write2 = this.MediaBrowserCompat$ItemReceiver.write(this.IconCompatParcelizer.get(), this.write.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

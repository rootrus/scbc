package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.bankingagent.C5562xb3a19c4a;
import p040o.ServerProjectProvider;

/* renamed from: o.performDrag */
public final class performDrag implements OPRStatusRewardsLandingActivity_ViewBinding<ServerProjectProvider.C70695> {
    private final HmlReviewDocumentActivity<C5562xb3a19c4a> IconCompatParcelizer;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindThirdPartySlipFragment> read;
    private final HmlReviewDocumentActivity<isEmailAddressIdentifierSupported> write;

    private performDrag(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5562xb3a19c4a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindThirdPartySlipFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<isEmailAddressIdentifierSupported> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static performDrag IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5562xb3a19c4a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindThirdPartySlipFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<isEmailAddressIdentifierSupported> hmlReviewDocumentActivity3) {
        return new performDrag(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        ServerProjectProvider.C70695 MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get(), this.read.get(), this.write.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

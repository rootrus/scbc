package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.C5080ny;

/* renamed from: o.unregisterDataSetObserver */
public final class unregisterDataSetObserver implements OPRStatusRewardsLandingActivity_ViewBinding<C7515tZ> {
    private final HmlReviewDocumentActivity<FragmentBuilder_BindRegistrationNewPinFragment> IconCompatParcelizer;
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<isUidGoogleSigned> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<C5080ny.write> read;

    private unregisterDataSetObserver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5080ny.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<isUidGoogleSigned> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindRegistrationNewPinFragment> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static unregisterDataSetObserver MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5080ny.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<isUidGoogleSigned> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindRegistrationNewPinFragment> hmlReviewDocumentActivity3) {
        return new unregisterDataSetObserver(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        C7515tZ MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

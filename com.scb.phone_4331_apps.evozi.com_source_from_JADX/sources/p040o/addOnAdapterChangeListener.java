package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.addOnAdapterChangeListener */
public final class addOnAdapterChangeListener implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindCloseAccountSelectionOwnFragment> {
    private final HmlReviewDocumentActivity<keys> IconCompatParcelizer;
    private final RepositoryModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<SharedPreferences> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<readObjectNoData$MediaBrowserCompat$ItemReceiver> write;

    private addOnAdapterChangeListener(RepositoryModule repositoryModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<readObjectNoData$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static addOnAdapterChangeListener write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<readObjectNoData$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity3) {
        return new addOnAdapterChangeListener(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        FragmentBuilder_BindCloseAccountSelectionOwnFragment MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

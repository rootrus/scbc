package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.demo.ntb.RegistrationActivity;
import java.io.File;
import p040o.AbstractMultimap;

/* renamed from: o.generateLayoutParams */
public final class generateLayoutParams implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.EntryIterator> {
    private final HmlReviewDocumentActivity<RegistrationActivity.write> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<setBackingMap$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<File> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule read;

    private generateLayoutParams(RepositoryModule repositoryModule, HmlReviewDocumentActivity<RegistrationActivity.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setBackingMap$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<File> hmlReviewDocumentActivity3) {
        this.read = repositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static generateLayoutParams MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<RegistrationActivity.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setBackingMap$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<File> hmlReviewDocumentActivity3) {
        return new generateLayoutParams(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.EntryIterator MediaBrowserCompat$CustomActionResultReceiver2 = this.read.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.data.network.api.ForgotPinApi;
import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.domain.repositories.ForgotPinRepositoryContractor;

/* renamed from: o.getItemPosition */
public final class getItemPosition implements OPRStatusRewardsLandingActivity_ViewBinding<ForgotPinRepositoryContractor> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zabn> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<ForgotPinApi> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<String> RatingCompat;
    private final HmlReviewDocumentActivity<ScriptIntrinsicConvolve5x5> read;
    private final HmlReviewDocumentActivity<getPendingIntent> write;

    private getItemPosition(RepositoryModule repositoryModule, HmlReviewDocumentActivity<ForgotPinApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getPendingIntent> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<zabn> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<ScriptIntrinsicConvolve5x5> hmlReviewDocumentActivity5) {
        this.IconCompatParcelizer = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.RatingCompat = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
    }

    public static getItemPosition read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<ForgotPinApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getPendingIntent> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<zabn> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<ScriptIntrinsicConvolve5x5> hmlReviewDocumentActivity5) {
        return new getItemPosition(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        ForgotPinRepositoryContractor read2 = this.IconCompatParcelizer.read(this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.RatingCompat.get(), this.read.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

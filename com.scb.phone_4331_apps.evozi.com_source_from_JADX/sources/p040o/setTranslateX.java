package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AccountTransferClient;
import p040o.C4768hj;

/* renamed from: o.setTranslateX */
public final class setTranslateX implements OPRStatusRewardsLandingActivity_ViewBinding<C10887sdkVersion> {
    private final HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<AccountTransferClient.zzc> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<isLockScreenSolved> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<SharedPreferences> RatingCompat;
    private final HmlReviewDocumentActivity<C4768hj.write> read;
    private final RepositoryModule write;

    private setTranslateX(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4768hj.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<isLockScreenSolved> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AccountTransferClient.zzc> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity5) {
        this.write = repositoryModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
        this.RatingCompat = hmlReviewDocumentActivity5;
    }

    public static setTranslateX read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4768hj.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<isLockScreenSolved> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AccountTransferClient.zzc> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity5) {
        return new setTranslateX(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        C10887sdkVersion read2 = this.write.read(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.RatingCompat.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

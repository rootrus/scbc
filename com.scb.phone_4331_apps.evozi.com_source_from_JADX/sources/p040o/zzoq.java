package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import java.io.File;
import okhttp3.OkHttpClient;

/* renamed from: o.zzoq */
public final class zzoq implements OPRStatusRewardsLandingActivity_ViewBinding<startCap> {
    private final HmlReviewDocumentActivity<OkHttpClient> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<LocalProjectProvider_MembersInjector> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<File> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzoq(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider_MembersInjector> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<File> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<OkHttpClient> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.MediaMetadataCompat = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
        this.IconCompatParcelizer = hmlReviewDocumentActivity5;
    }

    public static zzoq MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider_MembersInjector> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<File> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<OkHttpClient> hmlReviewDocumentActivity5) {
        return new zzoq(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        startCap write2 = this.MediaBrowserCompat$ItemReceiver.write(this.MediaMetadataCompat.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.IconCompatParcelizer.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import java.io.File;
import okhttp3.OkHttpClient;

/* renamed from: o.zzos */
public final class zzos implements OPRStatusRewardsLandingActivity_ViewBinding<StreetViewPanoramaCamera> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<OkHttpClient> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> RatingCompat;
    private final HmlReviewDocumentActivity<File> read;
    private final HmlReviewDocumentActivity<LocalProjectProvider_MembersInjector> write;

    private zzos(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider_MembersInjector> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<File> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<OkHttpClient> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.RatingCompat = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
    }

    public static zzos IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider_MembersInjector> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<File> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<OkHttpClient> hmlReviewDocumentActivity5) {
        return new zzos(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        StreetViewPanoramaCamera read2 = this.MediaBrowserCompat$ItemReceiver.read(this.RatingCompat.get(), this.IconCompatParcelizer.get(), this.write.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

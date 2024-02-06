package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.ServerProjectProvider;

/* renamed from: o.zzpj */
public final class zzpj implements OPRStatusRewardsLandingActivity_ViewBinding<getBaseUrl> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<ServerProjectProvider.C706515> write;

    private zzpj(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider.C706515> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zzpj read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ServerProjectProvider.C706515> hmlReviewDocumentActivity3) {
        return new zzpj(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        getBaseUrl read2 = this.MediaBrowserCompat$ItemReceiver.read(this.read.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

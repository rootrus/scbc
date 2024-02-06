package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzop */
public final class zzop implements OPRStatusRewardsLandingActivity_ViewBinding<replaceValues> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C6897xeb950f47> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final UseCaseModule write;

    private zzop(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6897xeb950f47> hmlReviewDocumentActivity3) {
        this.write = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zzop read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6897xeb950f47> hmlReviewDocumentActivity3) {
        return new zzop(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        replaceValues MediaMetadataCompat = this.write.MediaMetadataCompat(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaMetadataCompat != null) {
            return MediaMetadataCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

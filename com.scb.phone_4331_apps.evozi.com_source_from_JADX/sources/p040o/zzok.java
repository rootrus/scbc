package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzok */
public final class zzok implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractLinkedIterator> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C6897xeb950f47> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final UseCaseModule write;

    private zzok(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6897xeb950f47> hmlReviewDocumentActivity3) {
        this.write = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zzok read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6897xeb950f47> hmlReviewDocumentActivity3) {
        return new zzok(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        AbstractLinkedIterator write2 = this.write.write(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

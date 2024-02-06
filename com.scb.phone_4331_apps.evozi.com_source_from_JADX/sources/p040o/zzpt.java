package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;

/* renamed from: o.zzpt */
public final class zzpt implements OPRStatusRewardsLandingActivity_ViewBinding<alwaysTrue> {
    private final HmlReviewDocumentActivity<AbstractSortedSetMultimap> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final UseCaseModule write;

    private zzpt(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractSortedSetMultimap> hmlReviewDocumentActivity3) {
        this.write = useCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static zzpt write(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractSortedSetMultimap> hmlReviewDocumentActivity3) {
        return new zzpt(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        alwaysTrue read2 = this.write.read(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.IconCompatParcelizer.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

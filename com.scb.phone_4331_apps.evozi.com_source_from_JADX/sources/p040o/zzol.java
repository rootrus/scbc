package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.LocalProjectProvider;

/* renamed from: o.zzol */
public final class zzol implements OPRStatusRewardsLandingActivity_ViewBinding<setMaxGapFrames> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69375> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzol(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zzol write(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3) {
        return new zzol(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        setMaxGapFrames PlaybackStateCompat = this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat(this.write.get(), this.IconCompatParcelizer.get(), this.read.get());
        if (PlaybackStateCompat != null) {
            return PlaybackStateCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

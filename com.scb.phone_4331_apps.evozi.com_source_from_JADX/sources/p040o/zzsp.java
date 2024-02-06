package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.AbstractMultimap;
import p040o.SignInOptions;

/* renamed from: o.zzsp */
public final class zzsp implements OPRStatusRewardsLandingActivity_ViewBinding<SignInOptions.zaa> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.RandomAccessWrappedList> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzsp(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.RandomAccessWrappedList> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zzsp write(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.RandomAccessWrappedList> hmlReviewDocumentActivity3) {
        return new zzsp(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        SignInOptions.zaa MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.write.get(), this.IconCompatParcelizer.get(), this.read.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.CharMatcher;

/* renamed from: o.resizeInput */
public final class resizeInput implements OPRStatusRewardsLandingActivity_ViewBinding<CharMatcher.C31612> {
    private final HmlReviewDocumentActivity<C7534ua> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final UseCaseModule read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private resizeInput(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7534ua> hmlReviewDocumentActivity3) {
        this.read = useCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static resizeInput MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7534ua> hmlReviewDocumentActivity3) {
        return new resizeInput(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        CharMatcher.C31612 IconCompatParcelizer2 = this.read.IconCompatParcelizer(this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

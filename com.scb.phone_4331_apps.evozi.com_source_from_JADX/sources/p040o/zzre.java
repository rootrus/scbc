package p040o;

import com.scb.phone.domain.p036di.prepaid.activation.PrepaidActivationCaseModule;

/* renamed from: o.zzre */
public final class zzre implements OPRStatusRewardsLandingActivity_ViewBinding<Platform> {
    private final PrepaidActivationCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<getListDelegate> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzre(PrepaidActivationCaseModule prepaidActivationCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getListDelegate> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = prepaidActivationCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zzre read(PrepaidActivationCaseModule prepaidActivationCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getListDelegate> hmlReviewDocumentActivity3) {
        return new zzre(prepaidActivationCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Platform IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

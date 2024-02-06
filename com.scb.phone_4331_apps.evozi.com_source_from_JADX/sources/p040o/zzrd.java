package p040o;

import com.scb.phone.domain.p036di.prepaid.activation.PrepaidActivationCaseModule;
import p040o.Objects;

/* renamed from: o.zzrd */
public final class zzrd implements OPRStatusRewardsLandingActivity_ViewBinding<Objects.C36991> {
    private final PrepaidActivationCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<getListDelegate> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzrd(PrepaidActivationCaseModule prepaidActivationCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getListDelegate> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = prepaidActivationCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zzrd write(PrepaidActivationCaseModule prepaidActivationCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getListDelegate> hmlReviewDocumentActivity3) {
        return new zzrd(prepaidActivationCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Objects.C36991 read = this.IconCompatParcelizer.read(this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

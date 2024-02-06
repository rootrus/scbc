package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashEligibilityCaseModule;
import p040o.MultiDetector;

/* renamed from: o.zztp */
public final class zztp implements OPRStatusRewardsLandingActivity_ViewBinding<MultiDetector.Builder> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final EasycashEligibilityCaseModule read;
    private final HmlReviewDocumentActivity<subMap> write;

    private zztp(EasycashEligibilityCaseModule easycashEligibilityCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<subMap> hmlReviewDocumentActivity3) {
        this.read = easycashEligibilityCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zztp write(EasycashEligibilityCaseModule easycashEligibilityCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<subMap> hmlReviewDocumentActivity3) {
        return new zztp(easycashEligibilityCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        MultiDetector.Builder write2 = this.read.write(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

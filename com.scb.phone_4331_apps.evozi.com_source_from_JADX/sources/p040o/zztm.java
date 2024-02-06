package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashEligibilityCaseModule;

/* renamed from: o.zztm */
public final class zztm implements OPRStatusRewardsLandingActivity_ViewBinding<Frame> {
    private final HmlReviewDocumentActivity<subMap> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final EasycashEligibilityCaseModule write;

    private zztm(EasycashEligibilityCaseModule easycashEligibilityCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<subMap> hmlReviewDocumentActivity3) {
        this.write = easycashEligibilityCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static zztm MediaBrowserCompat$ItemReceiver(EasycashEligibilityCaseModule easycashEligibilityCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<subMap> hmlReviewDocumentActivity3) {
        return new zztm(easycashEligibilityCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Frame read = this.write.read(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

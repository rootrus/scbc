package p040o;

import com.scb.phone.data.network.api.insurance.InsuranceApi;

/* renamed from: o.zzjw */
public final class zzjw implements OPRStatusRewardsLandingActivity_ViewBinding<zzjy> {
    private final HmlReviewDocumentActivity<zac> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<InsuranceApi> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getSignInResultFromIntent> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zah> read;

    private zzjw(HmlReviewDocumentActivity<InsuranceApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zah> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<zac> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSignInResultFromIntent> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
    }

    public static zzjw MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<InsuranceApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zah> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<zac> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getSignInResultFromIntent> hmlReviewDocumentActivity4) {
        return new zzjw(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        return new zzjy(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get());
    }
}

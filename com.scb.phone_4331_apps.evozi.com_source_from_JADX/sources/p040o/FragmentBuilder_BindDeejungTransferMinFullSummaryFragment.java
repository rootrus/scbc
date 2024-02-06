package p040o;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;

/* renamed from: o.FragmentBuilder_BindDeejungTransferMinFullSummaryFragment */
public final class FragmentBuilder_BindDeejungTransferMinFullSummaryFragment implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindDepositFragment> {
    private final HmlReviewDocumentActivity<FingerprintManager> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<KeyguardManager> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<Context> write;

    private FragmentBuilder_BindDeejungTransferMinFullSummaryFragment(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<KeyguardManager> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FingerprintManager> hmlReviewDocumentActivity3) {
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static FragmentBuilder_BindDeejungTransferMinFullSummaryFragment read(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<KeyguardManager> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FingerprintManager> hmlReviewDocumentActivity3) {
        return new FragmentBuilder_BindDeejungTransferMinFullSummaryFragment(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new FragmentBuilder_BindDepositFragment(this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
    }
}

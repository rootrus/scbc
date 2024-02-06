package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashMCMCDetailCaseModule;
import p040o.Barcode;

/* renamed from: o.zzty */
public final class zzty implements OPRStatusRewardsLandingActivity_ViewBinding<Barcode.Address> {
    private final EasycashMCMCDetailCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<sortedMap> write;

    private zzty(EasycashMCMCDetailCaseModule easycashMCMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<sortedMap> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = easycashMCMCDetailCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zzty read(EasycashMCMCDetailCaseModule easycashMCMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<sortedMap> hmlReviewDocumentActivity3) {
        return new zzty(easycashMCMCDetailCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Barcode.Address MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

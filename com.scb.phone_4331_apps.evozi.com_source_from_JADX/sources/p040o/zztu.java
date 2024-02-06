package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashMCMCDetailCaseModule;
import p040o.Barcode;

/* renamed from: o.zztu */
public final class zztu implements OPRStatusRewardsLandingActivity_ViewBinding<Barcode.Phone> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final EasycashMCMCDetailCaseModule read;
    private final HmlReviewDocumentActivity<sortedMap> write;

    private zztu(EasycashMCMCDetailCaseModule easycashMCMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<sortedMap> hmlReviewDocumentActivity3) {
        this.read = easycashMCMCDetailCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zztu write(EasycashMCMCDetailCaseModule easycashMCMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<sortedMap> hmlReviewDocumentActivity3) {
        return new zztu(easycashMCMCDetailCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Barcode.Phone write2 = this.read.write(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

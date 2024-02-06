package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashMHMCDetailCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.zzub */
public final class zzub implements OPRStatusRewardsLandingActivity_ViewBinding<MultiProcessor> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashMHMCDetailCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.Values> read;

    private zzub(EasycashMHMCDetailCaseModule easycashMHMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.Values> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashMHMCDetailCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zzub MediaBrowserCompat$CustomActionResultReceiver(EasycashMHMCDetailCaseModule easycashMHMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.Values> hmlReviewDocumentActivity3) {
        return new zzub(easycashMHMCDetailCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        MultiProcessor read2 = this.MediaBrowserCompat$ItemReceiver.read(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

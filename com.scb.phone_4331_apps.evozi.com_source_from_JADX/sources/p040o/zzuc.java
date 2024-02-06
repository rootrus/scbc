package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashMHMCDetailCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.zzuc */
public final class zzuc implements OPRStatusRewardsLandingActivity_ViewBinding<setProcessor> {
    private final HmlReviewDocumentActivity<AbstractMultimap.Values> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashMHMCDetailCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzuc(EasycashMHMCDetailCaseModule easycashMHMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.Values> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashMHMCDetailCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zzuc read(EasycashMHMCDetailCaseModule easycashMHMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.Values> hmlReviewDocumentActivity3) {
        return new zzuc(easycashMHMCDetailCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        setProcessor MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.write.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashMHMCDetailCaseModule;
import p040o.AbstractMultimap;
import p040o.MultiProcessor;

/* renamed from: o.zzud */
public final class zzud implements OPRStatusRewardsLandingActivity_ViewBinding<MultiProcessor.zza> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final EasycashMHMCDetailCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.Values> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private zzud(EasycashMHMCDetailCaseModule easycashMHMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.Values> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashMHMCDetailCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zzud MediaBrowserCompat$CustomActionResultReceiver(EasycashMHMCDetailCaseModule easycashMHMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.Values> hmlReviewDocumentActivity3) {
        return new zzud(easycashMHMCDetailCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        MultiProcessor.zza write2 = this.MediaBrowserCompat$ItemReceiver.write(this.IconCompatParcelizer.get(), this.write.get(), this.read.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

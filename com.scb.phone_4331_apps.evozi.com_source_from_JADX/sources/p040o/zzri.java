package p040o;

import com.scb.phone.domain.p036di.prepaid.cashout.PrepaidCashOutCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.zzri */
public final class zzri implements OPRStatusRewardsLandingActivity_ViewBinding<isInstance> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<LocalProjectProvider> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final PrepaidCashOutCaseModule read;
    private final HmlReviewDocumentActivity<AbstractMultimap.MultisetEntry> write;

    private zzri(PrepaidCashOutCaseModule prepaidCashOutCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<AbstractMultimap.MultisetEntry> hmlReviewDocumentActivity4) {
        this.read = prepaidCashOutCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
    }

    public static zzri IconCompatParcelizer(PrepaidCashOutCaseModule prepaidCashOutCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<AbstractMultimap.MultisetEntry> hmlReviewDocumentActivity4) {
        return new zzri(prepaidCashOutCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        isInstance read2 = this.read.read(this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

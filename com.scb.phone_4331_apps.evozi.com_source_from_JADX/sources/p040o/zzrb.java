package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashSummaryCaseModule;
import p040o.AbstractMultimap;
import p040o.Barcode;

/* renamed from: o.zzrb */
public final class zzrb implements OPRStatusRewardsLandingActivity_ViewBinding<Barcode.PersonName> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashSummaryCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.ValueIterator> write;

    private zzrb(EasycashSummaryCaseModule easycashSummaryCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.ValueIterator> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashSummaryCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zzrb read(EasycashSummaryCaseModule easycashSummaryCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.ValueIterator> hmlReviewDocumentActivity3) {
        return new zzrb(easycashSummaryCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Barcode.PersonName write2 = this.MediaBrowserCompat$ItemReceiver.write(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

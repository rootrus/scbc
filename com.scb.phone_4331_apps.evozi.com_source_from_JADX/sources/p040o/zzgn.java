package p040o;

import com.scb.phone.data.network.service.ChubbService;
import p040o.ManageRecipientGroupActivity;

/* renamed from: o.zzgn */
public final class zzgn implements OPRStatusRewardsLandingActivity_ViewBinding<ManageRecipientGroupActivity.write> {
    private final HmlReviewDocumentActivity<AccountChangeEvent> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<ChubbService> write;

    private zzgn(HmlReviewDocumentActivity<ChubbService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<AccountChangeEvent> hmlReviewDocumentActivity2) {
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static zzgn IconCompatParcelizer(HmlReviewDocumentActivity<ChubbService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<AccountChangeEvent> hmlReviewDocumentActivity2) {
        return new zzgn(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new ManageRecipientGroupActivity.write(this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}

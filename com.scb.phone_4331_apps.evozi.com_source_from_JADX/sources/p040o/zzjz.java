package p040o;

import com.scb.phone.data.network.api.juristic.JuristicApi;

/* renamed from: o.zzjz */
public final class zzjz implements OPRStatusRewardsLandingActivity_ViewBinding<isPresent> {
    private final HmlReviewDocumentActivity<showErrorDialogFragment> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<JuristicApi> write;

    private zzjz(HmlReviewDocumentActivity<JuristicApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<showErrorDialogFragment> hmlReviewDocumentActivity2) {
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
    }

    public static zzjz MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<JuristicApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<showErrorDialogFragment> hmlReviewDocumentActivity2) {
        return new zzjz(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new isPresent(this.write.get(), this.MediaBrowserCompat$ItemReceiver.get());
    }
}

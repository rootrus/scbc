package p040o;

import com.scb.phone.domain.p036di.prepaid.request.PrepaidRequestCaseModule;

/* renamed from: o.zzrj */
public final class zzrj implements OPRStatusRewardsLandingActivity_ViewBinding<checkPositionIndex> {
    private final PrepaidRequestCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<getDelegateListIterator> read;

    private zzrj(PrepaidRequestCaseModule prepaidRequestCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getDelegateListIterator> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = prepaidRequestCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zzrj MediaBrowserCompat$CustomActionResultReceiver(PrepaidRequestCaseModule prepaidRequestCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getDelegateListIterator> hmlReviewDocumentActivity3) {
        return new zzrj(prepaidRequestCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        checkPositionIndex read2 = this.IconCompatParcelizer.read(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

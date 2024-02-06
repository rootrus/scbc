package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashCardInfoCaseModule;

/* renamed from: o.zztj */
public final class zztj implements OPRStatusRewardsLandingActivity_ViewBinding<setRequestedPreviewSize> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final EasycashCardInfoCaseModule read;
    private final HmlReviewDocumentActivity<comparator> write;

    private zztj(EasycashCardInfoCaseModule easycashCardInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<comparator> hmlReviewDocumentActivity3) {
        this.read = easycashCardInfoCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zztj MediaBrowserCompat$CustomActionResultReceiver(EasycashCardInfoCaseModule easycashCardInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<comparator> hmlReviewDocumentActivity3) {
        return new zztj(easycashCardInfoCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        setRequestedPreviewSize IconCompatParcelizer = this.read.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.data.network.service.EasycashService;
import com.scb.phone.data.network.service.easycash.EasycashDocumentUploadService;
import com.scb.phone.data.network.service.easycash.EasycashTermAndConditionsService;
import p040o.getAddress2FieldName;

/* renamed from: o.zabx */
public final class zabx implements OPRStatusRewardsLandingActivity_ViewBinding<getAddress2FieldName.read> {
    private final HmlReviewDocumentActivity<EasycashTermAndConditionsService> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<EasycashDocumentUploadService> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<EasycashService> read;

    private zabx(HmlReviewDocumentActivity<EasycashService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<EasycashTermAndConditionsService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<EasycashDocumentUploadService> hmlReviewDocumentActivity3) {
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static zabx IconCompatParcelizer(HmlReviewDocumentActivity<EasycashService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<EasycashTermAndConditionsService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<EasycashDocumentUploadService> hmlReviewDocumentActivity3) {
        return new zabx(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new getAddress2FieldName.read(this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get());
    }
}

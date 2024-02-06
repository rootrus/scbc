package p040o;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.scb.phone.domain.interactor.partner.nsip.NsipPartnerPaymentConfirmCase;

/* renamed from: o.getFieldID_Input */
public final class getFieldID_Input implements OPRStatusRewardsLandingActivity_ViewBinding<NsipPartnerPaymentConfirmCase.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<SharedPreferences> read;
    private final HmlReviewDocumentActivity<Gson> write;

    private getFieldID_Input(HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity2) {
        this.read = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
    }

    public static getFieldID_Input MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Gson> hmlReviewDocumentActivity2) {
        return new getFieldID_Input(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new NsipPartnerPaymentConfirmCase.IconCompatParcelizer(this.read.get(), this.write.get());
    }
}

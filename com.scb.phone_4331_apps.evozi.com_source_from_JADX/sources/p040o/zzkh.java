package p040o;

import com.scb.phone.data.network.api.mailingaddress.MailingAddressApi;
import p040o.Api;
import p040o.createElementSet;

/* renamed from: o.zzkh */
public final class zzkh implements OPRStatusRewardsLandingActivity_ViewBinding<zzkf> {
    private final HmlReviewDocumentActivity<createElementSet.IconCompatParcelizer> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<Api.AnyClient> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<MailingAddressApi> write;

    private zzkh(HmlReviewDocumentActivity<MailingAddressApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Api.AnyClient> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<createElementSet.IconCompatParcelizer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity4) {
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
    }

    public static zzkh read(HmlReviewDocumentActivity<MailingAddressApi> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Api.AnyClient> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<createElementSet.IconCompatParcelizer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity4) {
        return new zzkh(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        return new zzkf(this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}

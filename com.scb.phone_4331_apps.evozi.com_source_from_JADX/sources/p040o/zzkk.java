package p040o;

import com.scb.phone.data.network.service.prepaid.PrepaidActivationService;
import p040o.GoogleApiClient;

/* renamed from: o.zzkk */
public final class zzkk implements OPRStatusRewardsLandingActivity_ViewBinding<zzkl> {
    private final HmlReviewDocumentActivity<String> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<GoogleApiClient.OnConnectionFailedListener> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<setViewForPopups> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<PrepaidActivationService> read;
    private final HmlReviewDocumentActivity<addStatusListener> write;

    private zzkk(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrepaidActivationService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<GoogleApiClient.OnConnectionFailedListener> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<addStatusListener> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setViewForPopups> hmlReviewDocumentActivity5) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity5;
    }

    public static zzkk MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PrepaidActivationService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<GoogleApiClient.OnConnectionFailedListener> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<addStatusListener> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setViewForPopups> hmlReviewDocumentActivity5) {
        return new zzkk(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        return new zzkl(this.IconCompatParcelizer.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get());
    }
}

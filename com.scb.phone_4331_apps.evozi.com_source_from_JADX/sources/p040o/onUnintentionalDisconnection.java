package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasycashDocumentUploadService;

/* renamed from: o.onUnintentionalDisconnection */
public final class onUnintentionalDisconnection implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashDocumentUploadService> {
    private final EasycashServiceModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;

    private onUnintentionalDisconnection(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashServiceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static onUnintentionalDisconnection IconCompatParcelizer(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new onUnintentionalDisconnection(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EasycashDocumentUploadService write = this.MediaBrowserCompat$CustomActionResultReceiver.write(this.MediaBrowserCompat$ItemReceiver.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

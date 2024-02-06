package p040o;

import com.scb.phone.data.network.service.LoginService;
import com.scb.phone.data.network.service.LogoutService;
import com.scb.phone.data.p033di.DataModule;
import p040o.C5011nL;

/* renamed from: o.SwipeRefreshLayout */
public final class SwipeRefreshLayout implements OPRStatusRewardsLandingActivity_ViewBinding<C5011nL.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<LoginService> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<LogoutService> MediaBrowserCompat$CustomActionResultReceiver;
    private final DataModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<LoginService> read;

    private SwipeRefreshLayout(DataModule dataModule, HmlReviewDocumentActivity<LogoutService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LoginService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LoginService> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = dataModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static SwipeRefreshLayout write(DataModule dataModule, HmlReviewDocumentActivity<LogoutService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<LoginService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LoginService> hmlReviewDocumentActivity3) {
        return new SwipeRefreshLayout(dataModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        C5011nL.IconCompatParcelizer write = this.MediaBrowserCompat$ItemReceiver.write(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.read.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

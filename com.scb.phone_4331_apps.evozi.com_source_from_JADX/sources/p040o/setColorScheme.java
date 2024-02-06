package p040o;

import com.scb.phone.data.network.service.LoanService;
import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.setColorScheme */
public final class setColorScheme implements OPRStatusRewardsLandingActivity_ViewBinding<nE$MediaBrowserCompat$CustomActionResultReceiver> {
    private final HmlReviewDocumentActivity<LoanService> IconCompatParcelizer;
    private final DataModule write;

    private setColorScheme(DataModule dataModule, HmlReviewDocumentActivity<LoanService> hmlReviewDocumentActivity) {
        this.write = dataModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static setColorScheme write(DataModule dataModule, HmlReviewDocumentActivity<LoanService> hmlReviewDocumentActivity) {
        return new setColorScheme(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        nE$MediaBrowserCompat$CustomActionResultReceiver read = this.write.read(this.IconCompatParcelizer.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

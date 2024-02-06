package p040o;

import com.scb.phone.data.network.service.CreditCardService;
import com.scb.phone.data.p033di.DataModule;
import p040o.C4323eA;

/* renamed from: o.calcElementCount */
public final class calcElementCount implements OPRStatusRewardsLandingActivity_ViewBinding<C4323eA.write> {
    private final DataModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CreditCardService> read;

    private calcElementCount(DataModule dataModule, HmlReviewDocumentActivity<CreditCardService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = dataModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static calcElementCount MediaBrowserCompat$ItemReceiver(DataModule dataModule, HmlReviewDocumentActivity<CreditCardService> hmlReviewDocumentActivity) {
        return new calcElementCount(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        C4323eA.write read2 = this.MediaBrowserCompat$ItemReceiver.read(this.read.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.AbstractBiMap;

/* renamed from: o.zzql */
public final class zzql implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractBiMap.KeySet.C29911> {
    private final HmlReviewDocumentActivity<AbstractMultiset> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;

    private zzql(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultiset> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static zzql IconCompatParcelizer(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultiset> hmlReviewDocumentActivity3) {
        return new zzql(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        AbstractBiMap.KeySet.C29911 read2 = this.MediaBrowserCompat$CustomActionResultReceiver.read(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasycashSummaryService;

/* renamed from: o.w */
public final class C5450w implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashSummaryService> {
    private final EasycashServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> read;

    private C5450w(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = easycashServiceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static C5450w write(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new C5450w(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EasycashSummaryService AlertController$RecycleListView = this.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView(this.read.get());
        if (AlertController$RecycleListView != null) {
            return AlertController$RecycleListView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import android.content.res.AssetManager;
import com.scb.phone.data.network.service.CardManagementService;
import com.scb.phone.data.p033di.DataModule;
import com.scb.phone.view.activity.hml.HmlBaseReviewActivity;

/* renamed from: o.getDummyType */
public final class getDummyType implements OPRStatusRewardsLandingActivity_ViewBinding<HmlBaseReviewActivity.read> {
    private final HmlReviewDocumentActivity<AssetManager> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CardManagementService> MediaBrowserCompat$ItemReceiver;
    private final DataModule read;
    private final HmlReviewDocumentActivity<String> write;

    private getDummyType(DataModule dataModule, HmlReviewDocumentActivity<CardManagementService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        this.read = dataModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static getDummyType IconCompatParcelizer(DataModule dataModule, HmlReviewDocumentActivity<CardManagementService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        return new getDummyType(dataModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        HmlBaseReviewActivity.read IconCompatParcelizer2 = this.read.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

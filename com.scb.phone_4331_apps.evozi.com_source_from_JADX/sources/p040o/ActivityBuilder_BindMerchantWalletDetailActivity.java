package p040o;

import com.scb.phone.view.fragment.investment.p051di.TodayTransactionsTabModule;
import p040o.Sets;

/* renamed from: o.ActivityBuilder_BindMerchantWalletDetailActivity */
public final class ActivityBuilder_BindMerchantWalletDetailActivity implements OPRStatusRewardsLandingActivity_ViewBinding<getCropTetragon> {
    public static getCropTetragon MediaBrowserCompat$CustomActionResultReceiver(TodayTransactionsTabModule todayTransactionsTabModule, StreetViewPanoramaLink streetViewPanoramaLink, Sets.SetFromMap setFromMap, RegularImmutableBiMap regularImmutableBiMap) {
        getCropTetragon read = todayTransactionsTabModule.read(streetViewPanoramaLink, setFromMap, regularImmutableBiMap);
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.HmlReviewDocumentActivity, com.scb.phone.view.fragment.investment.di.TodayTransactionsTabModule] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        getCropTetragon read = r0.read((StreetViewPanoramaLink) r0.get(), (Sets.SetFromMap) r0.get(), (RegularImmutableBiMap) r0.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

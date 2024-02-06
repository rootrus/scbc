package p040o;

import p040o.zzrc;

/* renamed from: o.zzgj$MediaBrowserCompat$ItemReceiver */
final /* synthetic */ class zzgj$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<BuildConfig, zzrc.zzc> {
    zzgj$MediaBrowserCompat$ItemReceiver(setProductListSource setproductlistsource) {
        super(1, setproductlistsource);
    }

    public final String getName() {
        return "transform";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(setProductListSource.class);
    }

    public final String getSignature() {
        return "transform(Lcom/scb/phone/data/entity/ccrredemption/ECouponNotificationDeepLinkEntity;)Lcom/scb/phone/domain/entity/ccrredemption/ecoupon/MyECouponDeepLinkTransaction;";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        BuildConfig buildConfig = (BuildConfig) obj;
        onGetStartedClick.write((Object) buildConfig, "p1");
        return setProductListSource.IconCompatParcelizer(buildConfig);
    }
}

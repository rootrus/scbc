package p040o;

import p040o.zztx;

/* renamed from: o.zzgj$MediaBrowserCompat$SearchResultReceiver */
final /* synthetic */ class zzgj$MediaBrowserCompat$SearchResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<enableOrDisableHardwareLayer, zztx.zza> {
    zzgj$MediaBrowserCompat$SearchResultReceiver(zzl zzl) {
        super(1, zzl);
    }

    public final String getName() {
        return "transform";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(zzl.class);
    }

    public final String getSignature() {
        return "transform(Lcom/scb/phone/data/entity/ccrredemption/ecoupon/QuotaLimitEntity;)Lcom/scb/phone/domain/entity/ccrredemption/ecoupon/QuotaLimit;";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        enableOrDisableHardwareLayer enableordisablehardwarelayer = (enableOrDisableHardwareLayer) obj;
        onGetStartedClick.write((Object) enableordisablehardwarelayer, "p1");
        return zzl.MediaBrowserCompat$CustomActionResultReceiver(enableordisablehardwarelayer);
    }
}

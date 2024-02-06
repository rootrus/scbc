package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.Api;

/* renamed from: o.Api$ApiOptions$MediaBrowserCompat$ItemReceiver */
public final /* synthetic */ class Api$ApiOptions$MediaBrowserCompat$ItemReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<doPeek, CameraUpdateFactory> {
    public Api$ApiOptions$MediaBrowserCompat$ItemReceiver(Api.ApiOptions apiOptions) {
        super(1, apiOptions);
    }

    public final String getName() {
        return "transform";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(Api.ApiOptions.class);
    }

    public final String getSignature() {
        return "transform(Lcom/scb/phone/data/entity/merchant/MerchantWalletSettlementItemEntity;)Lcom/scb/phone/domain/entity/merchant/MerchantWalletSweepTransactionItem;";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        doPeek dopeek = (doPeek) obj;
        Api.ApiOptions apiOptions = (Api.ApiOptions) this.receiver;
        CameraUpdateFactory cameraUpdateFactory = new CameraUpdateFactory();
        String str4 = null;
        if (dopeek != null) {
            str = dopeek.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str = null;
        }
        cameraUpdateFactory.MediaBrowserCompat$CustomActionResultReceiver = str;
        if (dopeek != null) {
            str2 = dopeek.IconCompatParcelizer;
        } else {
            str2 = null;
        }
        cameraUpdateFactory.read = FragmentBuilder_BindSummaryFragment.write(str2, (OffsetDateTime) null);
        if (dopeek != null) {
            str3 = dopeek.write;
        } else {
            str3 = null;
        }
        Double valueOf = Double.valueOf(str3 != null ? Double.valueOf(str3).doubleValue() : 0.0d);
        onGetStartedClick.IconCompatParcelizer((Object) valueOf, "transformStringToDouble(entity?.amount)");
        cameraUpdateFactory.MediaBrowserCompat$ItemReceiver = valueOf.doubleValue();
        if (dopeek != null) {
            str4 = dopeek.MediaBrowserCompat$ItemReceiver;
        }
        cameraUpdateFactory.write = str4;
        return cameraUpdateFactory;
    }
}

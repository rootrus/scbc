package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzju$MediaBrowserCompat$CustomActionResultReceiver */
final /* synthetic */ class zzju$MediaBrowserCompat$CustomActionResultReceiver extends InvestmentFundDetailsActivity implements FundFactSheetActivity<SingleDataEntity<addUpdateListener>, addUpdateListener> {
    public static final zzju$MediaBrowserCompat$CustomActionResultReceiver write = new zzju$MediaBrowserCompat$CustomActionResultReceiver();

    zzju$MediaBrowserCompat$CustomActionResultReceiver() {
        super(1);
    }

    public final String getName() {
        return "getData";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(SingleDataEntity.class);
    }

    public final String getSignature() {
        return "getData()Ljava/lang/Object;";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "p1");
        return (addUpdateListener) singleDataEntity.getData();
    }
}

package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzju$MediaSessionCompat$ResultReceiverWrapper */
final /* synthetic */ class zzju$MediaSessionCompat$ResultReceiverWrapper extends InvestmentFundDetailsActivity implements FundFactSheetActivity<SingleDataEntity<ColorKeyframeAnimation>, ColorKeyframeAnimation> {
    public static final zzju$MediaSessionCompat$ResultReceiverWrapper MediaBrowserCompat$CustomActionResultReceiver = new zzju$MediaSessionCompat$ResultReceiverWrapper();

    zzju$MediaSessionCompat$ResultReceiverWrapper() {
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
        return (ColorKeyframeAnimation) singleDataEntity.getData();
    }
}

package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.ActivityBuilder_ContributeECouponRedemptionDeeplinkActivity;

/* renamed from: o.getter */
public final /* synthetic */ class getter implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ ActivityBuilder_ContributeECouponRedemptionDeeplinkActivity.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getter(ActivityBuilder_ContributeECouponRedemptionDeeplinkActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.read.read((getLayerModel) ((SingleDataEntity) obj).getData());
    }
}

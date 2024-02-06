package p040o;

import com.scb.phone.view.custom.common.C5819xbaeb1215;
import p040o.ActivityBuilder_ContributeECouponRedemptionDeeplinkActivity;

/* renamed from: o.deserializeFromBytes */
public final /* synthetic */ class deserializeFromBytes implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ ActivityBuilder_ContributeECouponRedemptionDeeplinkActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ deserializeFromBytes(ActivityBuilder_ContributeECouponRedemptionDeeplinkActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return setSelectedAccount.write(((clearCanvas) obj).MediaBrowserCompat$ItemReceiver, new C5819xbaeb1215(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem));
    }
}

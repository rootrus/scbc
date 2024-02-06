package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;
import p040o.Api;

/* renamed from: o.nanoTime */
public final /* synthetic */ class nanoTime implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindECouponQuantityFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ nanoTime(FragmentBuilder_BindECouponQuantityFragment fragmentBuilder_BindECouponQuantityFragment) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindECouponQuantityFragment;
    }

    public final Object write(Object obj) {
        Api.Client client = this.MediaBrowserCompat$ItemReceiver.write;
        close close = (close) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) close, "entity");
        return new newLatLng(FragmentBuilder_BindSummaryFragment.write(close.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null));
    }
}

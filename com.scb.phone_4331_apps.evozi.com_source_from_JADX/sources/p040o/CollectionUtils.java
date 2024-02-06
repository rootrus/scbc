package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.Api;

/* renamed from: o.CollectionUtils */
public final /* synthetic */ class CollectionUtils implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindECouponQuantityFragment read;

    public /* synthetic */ CollectionUtils(FragmentBuilder_BindECouponQuantityFragment fragmentBuilder_BindECouponQuantityFragment) {
        this.read = fragmentBuilder_BindECouponQuantityFragment;
    }

    public final Object write(Object obj) {
        return Api.ApiOptions.Optional.write((findByObject) ((SingleDataEntity) obj).getData());
    }
}

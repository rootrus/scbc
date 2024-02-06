package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;
import p040o.GoogleMap;

/* renamed from: o.isAtLeastLollipop */
public final /* synthetic */ class isAtLeastLollipop implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write read;

    public /* synthetic */ isAtLeastLollipop(FragmentBuilder_BindPurchaseProfileManagementFragment.write write) {
        this.read = write;
    }

    public final Object write(Object obj) {
        setExtraOffsets setextraoffsets = (setExtraOffsets) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) setextraoffsets, "entity");
        return new GoogleMap.OnMyLocationChangeListener(Integer.parseInt(setextraoffsets.read));
    }
}

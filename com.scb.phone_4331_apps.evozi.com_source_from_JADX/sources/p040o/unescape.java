package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;

/* renamed from: o.unescape */
public final /* synthetic */ class unescape implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write write;

    public /* synthetic */ unescape(FragmentBuilder_BindPurchaseProfileManagementFragment.write write2) {
        this.write = write2;
    }

    public final Object write(Object obj) {
        return this.write.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer((PINMessageException) ((SingleDataEntity) obj).getData());
    }
}

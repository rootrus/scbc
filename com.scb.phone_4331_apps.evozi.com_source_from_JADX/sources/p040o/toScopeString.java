package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;

/* renamed from: o.toScopeString */
public final /* synthetic */ class toScopeString implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write write;

    public /* synthetic */ toScopeString(FragmentBuilder_BindPurchaseProfileManagementFragment.write write2) {
        this.write = write2;
    }

    public final Object write(Object obj) {
        return ApiKey.MediaBrowserCompat$ItemReceiver((EncryptedMessageException) ((SingleDataEntity) obj).getData());
    }
}

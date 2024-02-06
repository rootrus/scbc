package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;

/* renamed from: o.publishWorldReadableSharedPreferences */
public final /* synthetic */ class publishWorldReadableSharedPreferences implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ publishWorldReadableSharedPreferences(FragmentBuilder_BindPurchaseProfileManagementFragment.write write) {
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final Object write(Object obj) {
        return ApiKey.MediaBrowserCompat$ItemReceiver((EncryptedMessageException) ((SingleDataEntity) obj).getData());
    }
}

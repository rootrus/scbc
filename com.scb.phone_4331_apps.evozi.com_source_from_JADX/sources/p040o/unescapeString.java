package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.FragmentBuilder_BindEasycashInputIncomeFragment;

/* renamed from: o.unescapeString */
public final /* synthetic */ class unescapeString implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindEasycashInputIncomeFragment.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ unescapeString(FragmentBuilder_BindEasycashInputIncomeFragment.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver((getKey) ((SingleDataEntity) obj).getData());
    }
}

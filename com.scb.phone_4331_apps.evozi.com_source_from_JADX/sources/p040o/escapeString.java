package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.FragmentBuilder_BindEasycashInputIncomeFragment;

/* renamed from: o.escapeString */
public final /* synthetic */ class escapeString implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindEasycashInputIncomeFragment.IconCompatParcelizer IconCompatParcelizer;

    public /* synthetic */ escapeString(FragmentBuilder_BindEasycashInputIncomeFragment.IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver((getKey) ((SingleDataEntity) obj).getData());
    }
}

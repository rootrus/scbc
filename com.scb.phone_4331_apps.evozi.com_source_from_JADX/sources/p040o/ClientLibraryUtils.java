package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.JsonReader;

/* renamed from: o.ClientLibraryUtils */
public final /* synthetic */ class ClientLibraryUtils implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindDiscoverFragment read;

    public /* synthetic */ ClientLibraryUtils(FragmentBuilder_BindDiscoverFragment fragmentBuilder_BindDiscoverFragment) {
        this.read = fragmentBuilder_BindDiscoverFragment;
    }

    public final Object write(Object obj) {
        FragmentBuilder_BindDiscoverFragment fragmentBuilder_BindDiscoverFragment = this.read;
        return DebitCardResetOtpActivity.just(fragmentBuilder_BindDiscoverFragment.read.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindDiscoverFragment.write(), ((JsonReader.Token) ((SingleDataEntity) obj).getData()).MediaBrowserCompat$CustomActionResultReceiver));
    }
}

package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.JsonReader;

/* renamed from: o.currentTimeMillis */
public final /* synthetic */ class currentTimeMillis implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindDiscoverFragment read;

    public /* synthetic */ currentTimeMillis(FragmentBuilder_BindDiscoverFragment fragmentBuilder_BindDiscoverFragment) {
        this.read = fragmentBuilder_BindDiscoverFragment;
    }

    public final Object write(Object obj) {
        onPlaceSelected onplaceselected;
        FragmentBuilder_BindDiscoverFragment fragmentBuilder_BindDiscoverFragment = this.read;
        List<onPlaceSelected> MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindDiscoverFragment.read.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindDiscoverFragment.write(), ((JsonReader.Token) ((SingleDataEntity) obj).getData()).MediaBrowserCompat$CustomActionResultReceiver);
        if (!MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            onplaceselected = MediaBrowserCompat$CustomActionResultReceiver.get(0);
        } else {
            onplaceselected = new onPlaceSelected();
        }
        return DebitCardResetOtpActivity.just(onplaceselected);
    }
}

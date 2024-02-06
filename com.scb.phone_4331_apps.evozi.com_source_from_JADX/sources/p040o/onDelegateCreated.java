package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.FragmentBuilder_BindSCBSRiskLevelFragment;

/* renamed from: o.onDelegateCreated */
public final /* synthetic */ class onDelegateCreated implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindSCBSRiskLevelFragment.read MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ onDelegateCreated(FragmentBuilder_BindSCBSRiskLevelFragment.read read) {
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((SingleDataEntity) obj));
    }
}

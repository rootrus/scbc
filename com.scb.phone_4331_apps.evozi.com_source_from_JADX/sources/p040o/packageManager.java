package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BackgroundDetector;

/* renamed from: o.packageManager */
public final /* synthetic */ class packageManager implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6697xa3eba5a5 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ packageManager(C6697xa3eba5a5 fragmentBuilder_BindQuickPromptPayFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindQuickPromptPayFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        return BackgroundDetector.BackgroundStateChangeListener.read((setHardwareAccelerationEnabled) ((SingleDataEntity) obj).getData());
    }
}

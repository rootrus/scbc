package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BackgroundDetector;

/* renamed from: o.checkPermission */
public final /* synthetic */ class checkPermission implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6697xa3eba5a5 write;

    public /* synthetic */ checkPermission(C6697xa3eba5a5 fragmentBuilder_BindQuickPromptPayFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write = fragmentBuilder_BindQuickPromptPayFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        return BackgroundDetector.BackgroundStateChangeListener.read((setHardwareAccelerationEnabled) ((SingleDataEntity) obj).getData());
    }
}

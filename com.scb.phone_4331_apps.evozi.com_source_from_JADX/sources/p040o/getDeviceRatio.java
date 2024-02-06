package p040o;

import p040o.PassportWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDeviceRatio */
public final /* synthetic */ class getDeviceRatio implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ addDelayedShutdownHook MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getDeviceRatio(addDelayedShutdownHook adddelayedshutdownhook) {
        this.MediaBrowserCompat$ItemReceiver = adddelayedshutdownhook;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportWorkflowActivity.C6985a) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}

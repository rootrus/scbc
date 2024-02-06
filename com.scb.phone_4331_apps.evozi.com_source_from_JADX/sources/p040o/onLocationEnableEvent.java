package p040o;

import p040o.ExecutorUtils;
import p040o.writeUInt64NoTag;

/* renamed from: o.onLocationEnableEvent */
public final /* synthetic */ class onLocationEnableEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ExecutorUtils.C33371 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ onLocationEnableEvent(ExecutorUtils.C33371 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters_Factory) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

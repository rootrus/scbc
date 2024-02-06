package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.verifyRestrictions */
public final /* synthetic */ class verifyRestrictions implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ handleUncaughtException MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ verifyRestrictions(handleUncaughtException handleuncaughtexception) {
        this.MediaBrowserCompat$ItemReceiver = handleuncaughtexception;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.C6976c) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}

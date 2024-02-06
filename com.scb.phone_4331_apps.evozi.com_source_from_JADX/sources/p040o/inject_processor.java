package p040o;

import p040o.C7500tH;
import p040o.writeUInt64NoTag;

/* renamed from: o.inject_processor */
public final /* synthetic */ class inject_processor implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C7500tH.write MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ parseSession read;

    public /* synthetic */ inject_processor(C7500tH.write write, parseSession parsesession) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
        this.read = parsesession;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setExpirationYear) obj).write(this.read);
    }
}

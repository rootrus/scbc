package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getCustomHeaders */
public final /* synthetic */ class getCustomHeaders implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ defaultSettings$MediaBrowserCompat$CustomActionResultReceiver read;

    public /* synthetic */ getCustomHeaders(defaultSettings$MediaBrowserCompat$CustomActionResultReceiver defaultsettings_mediabrowsercompat_customactionresultreceiver) {
        this.read = defaultsettings_mediabrowsercompat_customactionresultreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule$a$MediaBrowserCompat$SearchResultReceiver) obj).write(this.read.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
    }
}

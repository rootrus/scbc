package p040o;

import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.getGreenCircle */
public final /* synthetic */ class getGreenCircle implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ qT$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getGreenCircle(qT$MediaBrowserCompat$CustomActionResultReceiver qt_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$ItemReceiver = qt_mediabrowsercompat_customactionresultreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((ServerProjectProvider.C70706) obj).read(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

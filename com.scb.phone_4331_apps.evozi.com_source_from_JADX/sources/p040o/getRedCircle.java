package p040o;

import p040o.ServerProjectProvider;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRedCircle */
public final /* synthetic */ class getRedCircle implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ qT$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getRedCircle(qT$MediaBrowserCompat$CustomActionResultReceiver qt_mediabrowsercompat_customactionresultreceiver, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = qt_mediabrowsercompat_customactionresultreceiver;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        qT$MediaBrowserCompat$CustomActionResultReceiver qt_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        ((ServerProjectProvider.C70706) obj).read(qt_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS));
    }
}

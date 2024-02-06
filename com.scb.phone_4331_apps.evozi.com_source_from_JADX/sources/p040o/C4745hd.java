package p040o;

import p040o.LocalProjectProvider;
import p040o.LogFileManager;
import p040o.writeUInt64NoTag;

/* renamed from: o.hd */
public final /* synthetic */ class C4745hd implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ parseEventSignal MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ LogFileManager.C35981 read;

    public /* synthetic */ C4745hd(parseEventSignal parseeventsignal, LogFileManager.C35981 r2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parseeventsignal;
        this.read = r2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((LocalProjectProvider.VersionTable) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }
}

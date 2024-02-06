package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.sendReport */
public final /* synthetic */ class sendReport implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4513xa1018272 IconCompatParcelizer;

    public /* synthetic */ sendReport(C4513xa1018272 getcachedsettingsdata_mediabrowsercompat_customactionresultreceiver) {
        this.IconCompatParcelizer = getcachedsettingsdata_mediabrowsercompat_customactionresultreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule$a$MediaSessionCompat$QueueItem) obj).write(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
    }
}

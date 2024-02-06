package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ReportManager */
public final /* synthetic */ class ReportManager implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ ReportManager(String str, String str2) {
        this.read = str;
        this.write = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule$a$MediaBrowserCompat$MediaItem) obj).MediaBrowserCompat$ItemReceiver(this.read, this.write);
    }
}

package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.uploadReport */
public final /* synthetic */ class uploadReport implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ uploadReport(String str, String str2, String str3) {
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule$a$MediaBrowserCompat$MediaItem) obj).read(this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }
}

package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.writeSessionEventLog */
public final /* synthetic */ class writeSessionEventLog implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ writeSessionEventLog(String str, String str2, String str3) {
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule$a$MediaBrowserCompat$ItemReceiver) obj).read(this.IconCompatParcelizer, this.read, this.MediaBrowserCompat$ItemReceiver);
    }
}

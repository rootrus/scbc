package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.writeSessionEventAppExecutionException */
public final /* synthetic */ class writeSessionEventAppExecutionException implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ writeSessionEventAppExecutionException(String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule$a$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.write);
    }
}

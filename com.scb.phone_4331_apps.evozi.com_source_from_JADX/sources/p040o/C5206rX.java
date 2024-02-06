package p040o;

import p040o.C5171qQ;
import p040o.access$2300;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.rX */
public final /* synthetic */ class C5206rX implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C5171qQ.read write;

    public /* synthetic */ C5206rX(C5171qQ.read read, Throwable th) {
        this.write = read;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C5171qQ.read read = this.write;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        getTopLeftCornerWidth.Keep keep = (getTopLeftCornerWidth.Keep) obj;
        if (!C5171qQ.this.MediaBrowserCompat$SearchResultReceiver(th)) {
            keep.MediaBrowserCompat$CustomActionResultReceiver(C5171qQ.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}

package p040o;

import p040o.C4176cd;
import p040o.KtaJsonCheck;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRttiExtraction */
public final /* synthetic */ class getRttiExtraction implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4176cd.read write;

    public /* synthetic */ getRttiExtraction(C4176cd.read read, Throwable th) {
        this.write = read;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4176cd.read read = this.write;
        ((KtaJsonCheck.RatingCompat) obj).MediaBrowserCompat$ItemReceiver(C4176cd.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS));
    }
}

package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.dW */
public final /* synthetic */ class C4270dW implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4300dt write;

    public /* synthetic */ C4270dW(C4300dt dtVar, Throwable th) {
        this.write = dtVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4300dt dtVar = this.write;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        printStackTrace printstacktrace = (printStackTrace) obj;
        printstacktrace.aj_();
        printstacktrace.MediaBrowserCompat$ItemReceiver(dtVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}

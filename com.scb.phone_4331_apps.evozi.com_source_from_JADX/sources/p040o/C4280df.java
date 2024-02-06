package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.df */
public final /* synthetic */ class C4280df implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4336eE MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4280df(C4336eE eEVar, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = eEVar;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4336eE eEVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        Throwable th = this.MediaBrowserCompat$ItemReceiver;
        printStackTrace printstacktrace = (printStackTrace) obj;
        printstacktrace.aj_();
        printstacktrace.MediaBrowserCompat$ItemReceiver(eEVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}

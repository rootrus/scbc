package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getEPC  reason: case insensitive filesystem */
public final /* synthetic */ class C10897getEPC implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ registerNewObjectListener write;

    public /* synthetic */ C10897getEPC(registerNewObjectListener registernewobjectlistener, Throwable th) {
        this.write = registernewobjectlistener;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        registerNewObjectListener registernewobjectlistener = this.write;
        C7138hs hsVar = (C7138hs) obj;
        hsVar.write(registernewobjectlistener.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
        hsVar.aj_();
    }
}

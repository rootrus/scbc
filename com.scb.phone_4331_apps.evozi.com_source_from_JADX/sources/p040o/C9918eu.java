package p040o;

import p040o.C4400fO;
import p040o.writeUInt64NoTag;

/* renamed from: o.eu */
public final /* synthetic */ class C9918eu implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ access$2200 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4400fO.C44035 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C9918eu(C4400fO.C44035 r1, access$2200 access_2200) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = access_2200;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4400fO.C44035 r0 = this.MediaBrowserCompat$ItemReceiver;
        access$2200 access_2200 = this.MediaBrowserCompat$CustomActionResultReceiver;
        C4400fO.MediaBrowserCompat$CustomActionResultReceiver(C4400fO.this);
        ((getBlackStreakCount) obj).write(access_2200);
    }
}

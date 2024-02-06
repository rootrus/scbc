package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.bW */
public final /* synthetic */ class C4082bW implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4082bW(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.IconCompatParcelizer) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}

package p040o;

import p040o.IdCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.locationString */
public final /* synthetic */ class locationString implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ locationString(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule.C6905a) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}

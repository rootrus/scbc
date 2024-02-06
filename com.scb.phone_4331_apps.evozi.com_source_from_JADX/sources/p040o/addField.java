package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.addField */
public final /* synthetic */ class addField implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ addField(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule_GetIParametersFactory) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}

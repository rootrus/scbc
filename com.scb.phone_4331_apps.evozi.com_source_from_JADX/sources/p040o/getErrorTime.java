package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getErrorTime */
public final /* synthetic */ class getErrorTime implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getErrorTime(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getHighestVersion) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}

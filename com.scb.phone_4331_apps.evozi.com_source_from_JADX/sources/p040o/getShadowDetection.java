package p040o;

import p040o.getUsable;
import p040o.writeUInt64NoTag;

/* renamed from: o.getShadowDetection */
public final /* synthetic */ class getShadowDetection implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ getShadowDetection(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getUsable.read) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }
}

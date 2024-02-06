package p040o;

import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.getMaxTextureSize */
public final /* synthetic */ class getMaxTextureSize implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getMaxTextureSize(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv.write) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

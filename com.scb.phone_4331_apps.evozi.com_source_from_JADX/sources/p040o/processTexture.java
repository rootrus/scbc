package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.processTexture */
public final /* synthetic */ class processTexture implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ ColorPassThroughShader write;

    public /* synthetic */ processTexture(ColorPassThroughShader colorPassThroughShader, String str) {
        this.write = colorPassThroughShader;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv.write) obj).MediaBrowserCompat$ItemReceiver(DiskLruCache.VERSION_1.equalsIgnoreCase(this.MediaBrowserCompat$ItemReceiver));
    }
}

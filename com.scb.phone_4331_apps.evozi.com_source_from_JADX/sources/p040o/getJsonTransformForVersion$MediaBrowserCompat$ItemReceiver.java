package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.getJsonTransformForVersion$MediaBrowserCompat$ItemReceiver */
public final class getJsonTransformForVersion$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
    private /* synthetic */ getJsonTransformForVersion read;

    public getJsonTransformForVersion$MediaBrowserCompat$ItemReceiver(getJsonTransformForVersion getjsontransformforversion) {
        this.read = getjsontransformforversion;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.C6929b) obj).IconCompatParcelizer(this.read.read, this.read.write);
    }
}

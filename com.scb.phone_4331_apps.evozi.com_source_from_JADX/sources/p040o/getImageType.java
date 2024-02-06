package p040o;

import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImageType */
public final /* synthetic */ class getImageType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ jsonToUserData write;

    public /* synthetic */ getImageType(jsonToUserData jsontouserdata) {
        this.write = jsontouserdata;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getMicrAmount.read) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write);
    }
}

package p040o;

import p040o.getContour;
import p040o.writeUInt64NoTag;

/* renamed from: o.RemoteMessage */
public final /* synthetic */ class RemoteMessage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzxq write;

    public /* synthetic */ RemoteMessage(zzxq zzxq) {
        this.write = zzxq;
    }

    public final void IconCompatParcelizer(Object obj) {
        getContour.read.MediaBrowserCompat$CustomActionResultReceiver(this.write, (setResultDeserializer) obj);
    }
}

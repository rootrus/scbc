package p040o;

import java.util.List;
import p040o.getLastKnownLocation;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.setFaceRect */
public final /* synthetic */ class setFaceRect implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getLastKnownLocation.read IconCompatParcelizer;
    private final /* synthetic */ List write;

    public /* synthetic */ setFaceRect(getLastKnownLocation.read read, List list) {
        this.IconCompatParcelizer = read;
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.PlaybackStateCompat.CustomAction) obj).MediaBrowserCompat$ItemReceiver(toShortArray.MediaBrowserCompat$ItemReceiver(this.write, new C4796ii(getLastKnownLocation.this.IconCompatParcelizer)));
    }
}

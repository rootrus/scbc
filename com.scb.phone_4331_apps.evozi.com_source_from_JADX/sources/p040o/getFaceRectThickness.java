package p040o;

import java.util.List;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getFaceRectThickness */
public final /* synthetic */ class getFaceRectThickness implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ getLastKnownLocation$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ getFaceRectThickness(getLastKnownLocation$MediaBrowserCompat$ItemReceiver getlastknownlocation_mediabrowsercompat_itemreceiver, List list) {
        this.write = getlastknownlocation_mediabrowsercompat_itemreceiver;
        this.IconCompatParcelizer = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.PlaybackStateCompat.CustomAction) obj).MediaBrowserCompat$ItemReceiver(toShortArray.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, new C4796ii(this.write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)));
    }
}

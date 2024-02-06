package p040o;

import p040o.C4381eq;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.eZ */
public final /* synthetic */ class C4358eZ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4381eq.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4358eZ(C4381eq.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setBackgroundResource) obj).read(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver == 0 ? "com.scb.phone/BROADCAST_ADD_TILE_TO_ROOT" : "com.scb.phone/BROADCAST_ADD_TILE_TO_CHILD");
    }
}

package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.LocationEvent */
public final /* synthetic */ class LocationEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFileSHA MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ LocationEvent(getFileSHA getfilesha) {
        this.MediaBrowserCompat$ItemReceiver = getfilesha;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C7535ub) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}

package p040o;

import p040o.StreetViewPanoramaView;

/* renamed from: o.AbstractCheckedFuture */
public final /* synthetic */ class AbstractCheckedFuture implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ AbstractCheckedFuture(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final boolean write(Object obj) {
        return ((StreetViewPanoramaView.zza) obj).MediaMetadataCompat.equalsIgnoreCase(this.MediaBrowserCompat$ItemReceiver);
    }
}

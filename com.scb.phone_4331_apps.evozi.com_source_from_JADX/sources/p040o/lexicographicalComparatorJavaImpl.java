package p040o;

import p040o.StreetViewPanoramaView;

/* renamed from: o.lexicographicalComparatorJavaImpl */
public final /* synthetic */ class lexicographicalComparatorJavaImpl implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ StreetViewPanoramaView.zza MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ lexicographicalComparatorJavaImpl(StreetViewPanoramaView.zza zza) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zza;
    }

    public final boolean write(Object obj) {
        return ((onIndoorLevelActivated) obj).read.equalsIgnoreCase(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat);
    }
}

package p040o;

/* renamed from: o.toInt */
public final /* synthetic */ class toInt implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ lessThanUnsigned MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ onInfoWindowLongClick read;

    public /* synthetic */ toInt(lessThanUnsigned lessthanunsigned, onInfoWindowLongClick oninfowindowlongclick) {
        this.MediaBrowserCompat$ItemReceiver = lessthanunsigned;
        this.read = oninfowindowlongclick;
    }

    public final boolean write(Object obj) {
        onInfoWindowLongClick oninfowindowlongclick = this.read;
        StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) obj;
        if (oninfowindowlongclick.setHasDecor != null && streetViewPanoramaOptions.f2790x50fd9e4a.equals(oninfowindowlongclick.setHasDecor.IconCompatParcelizer)) {
            return true;
        }
        if (oninfowindowlongclick.AppCompatActivity != null && streetViewPanoramaOptions.MediaBrowserCompat$CustomActionResultReceiver.equals(oninfowindowlongclick.AppCompatActivity.IconCompatParcelizer)) {
            return true;
        }
        if ((oninfowindowlongclick.MediaSessionCompat$QueueItem != null) || streetViewPanoramaOptions.MediaBrowserCompat$CustomActionResultReceiver.equals(oninfowindowlongclick.setBackgroundResource)) {
            return true;
        }
        return false;
    }
}

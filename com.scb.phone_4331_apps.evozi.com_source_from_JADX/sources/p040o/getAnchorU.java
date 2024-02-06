package p040o;

/* renamed from: o.getAnchorU */
public final /* synthetic */ class getAnchorU implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ setActivity read;

    public /* synthetic */ getAnchorU(setActivity setactivity) {
        this.read = setactivity;
    }

    public final boolean write(Object obj) {
        return ((setZoomControlsEnabled) obj).read.equals(Integer.valueOf(this.read.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$MediaItem));
    }
}

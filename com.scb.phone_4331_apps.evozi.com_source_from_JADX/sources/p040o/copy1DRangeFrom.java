package p040o;

/* renamed from: o.copy1DRangeFrom */
public final class copy1DRangeFrom extends createCubemapFromCubeFaces<copy2DRangeFromUnchecked> {
    public copy1DRangeFrom(copy2DRangeFromUnchecked copy2drangefromunchecked) {
        super(copy2drangefromunchecked);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 1 && i != 5 && i != 9 && i != 13 && i != 17 && i != 21 && i != 25) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        Integer MediaBrowserCompat$CustomActionResultReceiver = ((copy2DRangeFromUnchecked) this.write).MediaBrowserCompat$CustomActionResultReceiver(i);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return super.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver.shortValue());
    }
}

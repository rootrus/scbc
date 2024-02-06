package p040o;

/* renamed from: o.getWorkingFileForSession$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9989x990b9991 implements findFragmentByWho {
    private final /* synthetic */ PreLoadCheckActivity write;

    private C9989x990b9991() {
    }

    public /* synthetic */ C9989x990b9991(PreLoadCheckActivity preLoadCheckActivity) {
        this.write = preLoadCheckActivity;
    }

    public final Object IconCompatParcelizer(Object obj) {
        applyIntersectMask applyintersectmask = (applyIntersectMask) obj;
        LocationSettingsRequest locationSettingsRequest = new LocationSettingsRequest();
        locationSettingsRequest.MediaBrowserCompat$CustomActionResultReceiver = applyintersectmask.IconCompatParcelizer;
        String str = "-";
        locationSettingsRequest.write = applyintersectmask.write != null ? applyintersectmask.write.write() : str;
        locationSettingsRequest.IconCompatParcelizer = applyintersectmask.read != null ? applyintersectmask.read : str;
        if (applyintersectmask.write != null) {
            str = applyintersectmask.write.IconCompatParcelizer();
        }
        locationSettingsRequest.RatingCompat = str;
        locationSettingsRequest.MediaBrowserCompat$SearchResultReceiver = applyintersectmask.MediaBrowserCompat$MediaItem;
        locationSettingsRequest.read = applyintersectmask.MediaBrowserCompat$ItemReceiver;
        locationSettingsRequest.MediaBrowserCompat$ItemReceiver = applyintersectmask.MediaBrowserCompat$CustomActionResultReceiver;
        return locationSettingsRequest;
    }
}

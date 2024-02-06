package p040o;

/* renamed from: o.insertOrUpdatePersistedInstallationEntry */
public final /* synthetic */ class insertOrUpdatePersistedInstallationEntry implements findFragmentByWho {
    private final /* synthetic */ newHashMap IconCompatParcelizer;

    public /* synthetic */ insertOrUpdatePersistedInstallationEntry(newHashMap newhashmap) {
        this.IconCompatParcelizer = newhashmap;
    }

    public final Object IconCompatParcelizer(Object obj) {
        int i;
        newHashMap newhashmap = this.IconCompatParcelizer;
        onInfoWindowLongClick oninfowindowlongclick = (onInfoWindowLongClick) obj;
        setNameFormat MediaBrowserCompat$ItemReceiver = setNameFormat.MediaBrowserCompat$ItemReceiver();
        if (oninfowindowlongclick.Keep != null) {
            i = oninfowindowlongclick.Keep.intValue();
        } else {
            i = 0;
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = i;
        MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = oninfowindowlongclick.AppCompatDialogFragment;
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = newhashmap.mo26549c_(oninfowindowlongclick.setContentView);
        MediaBrowserCompat$ItemReceiver.RatingCompat = oninfowindowlongclick.ActionMenuItemView;
        MediaBrowserCompat$ItemReceiver.read = oninfowindowlongclick.MediaBrowserCompat$MediaItem;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = oninfowindowlongclick.setBackgroundResource;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = oninfowindowlongclick.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = false;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = true;
        return MediaBrowserCompat$ItemReceiver;
    }
}

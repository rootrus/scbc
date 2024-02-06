package p040o;

/* renamed from: o.doRegisterEventListener */
public final class doRegisterEventListener extends FragmentBuilder_BindSummaryFragment {
    public final getMinZoomLevel MediaBrowserCompat$ItemReceiver(notifyStart notifystart) {
        if (notifystart == null) {
            return null;
        }
        getMinZoomLevel getminzoomlevel = new getMinZoomLevel();
        getminzoomlevel.write = notifystart.MediaBrowserCompat$CustomActionResultReceiver;
        getminzoomlevel.MediaMetadataCompat = notifystart.MediaBrowserCompat$SearchResultReceiver;
        getminzoomlevel.IconCompatParcelizer = notifystart.IconCompatParcelizer;
        getminzoomlevel.MediaDescriptionCompat = notifystart.MediaMetadataCompat;
        getminzoomlevel.MediaBrowserCompat$ItemReceiver = notifystart.MediaBrowserCompat$ItemReceiver;
        getminzoomlevel.read = write(notifystart.write);
        getminzoomlevel.MediaBrowserCompat$CustomActionResultReceiver = notifystart.read;
        return getminzoomlevel;
    }
}

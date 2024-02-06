package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.capAndGetOpenSessions */
public final /* synthetic */ class capAndGetOpenSessions implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ isRestrictedToPlacesOpenNow MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getEventAppCustomAttributeSize read;

    public /* synthetic */ capAndGetOpenSessions(getEventAppCustomAttributeSize geteventappcustomattributesize, isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow) {
        this.read = geteventappcustomattributesize;
        this.MediaBrowserCompat$ItemReceiver = isrestrictedtoplacesopennow;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        getEventAppCustomAttributeSize geteventappcustomattributesize = this.read;
        isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow = this.MediaBrowserCompat$ItemReceiver;
        getCar getcar = (getCar) obj;
        String MediaBrowserCompat$ItemReceiver2 = geteventappcustomattributesize.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(isrestrictedtoplacesopennow.MediaBrowserCompat$SearchResultReceiver, isrestrictedtoplacesopennow.MediaMetadataCompat);
        String str2 = isrestrictedtoplacesopennow.read;
        String str3 = isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver;
        String str4 = isrestrictedtoplacesopennow.MediaDescriptionCompat;
        String checkable = geteventappcustomattributesize.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.setCheckable();
        isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow2 = geteventappcustomattributesize.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.write().MediaBrowserCompat$CustomActionResultReceiver;
        if (isrestrictedtoplacesopennow2 == null) {
            str = null;
        } else if ("th".equalsIgnoreCase(checkable)) {
            str = isrestrictedtoplacesopennow2.MediaBrowserCompat$MediaItem;
        } else {
            str = isrestrictedtoplacesopennow2.write;
        }
        getcar.IconCompatParcelizer(new getSessionIdForFile(MediaBrowserCompat$ItemReceiver2, str2, str3, str4, str));
    }
}

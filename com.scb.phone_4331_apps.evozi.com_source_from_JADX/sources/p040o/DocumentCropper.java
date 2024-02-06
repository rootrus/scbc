package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentCropper */
public final /* synthetic */ class DocumentCropper implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ isRestrictedToPlacesOpenNow MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ nativeGetShadowContours write;

    public /* synthetic */ DocumentCropper(nativeGetShadowContours nativegetshadowcontours, isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow) {
        this.write = nativegetshadowcontours;
        this.MediaBrowserCompat$CustomActionResultReceiver = isrestrictedtoplacesopennow;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeGetShadowContours nativegetshadowcontours = this.write;
        isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getAdditionalRightScanLinesWidth) obj).MediaBrowserCompat$ItemReceiver(nativegetshadowcontours.write.MediaBrowserCompat$ItemReceiver(isrestrictedtoplacesopennow.MediaBrowserCompat$SearchResultReceiver, isrestrictedtoplacesopennow.MediaMetadataCompat), isrestrictedtoplacesopennow.read, isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver, isrestrictedtoplacesopennow.MediaDescriptionCompat);
    }
}

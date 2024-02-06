package p040o;

import p040o.GoogleMap;

/* renamed from: o.getContours */
public class getContours {
    private getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public getContours(getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$ItemReceiver = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        GoogleMap.OnMarkerDragListener MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem();
        if (str != null) {
            MediaBrowserCompat$MediaItem.MediaDescriptionCompat = str;
        }
        MediaBrowserCompat$MediaItem.MediaBrowserCompat$SearchResultReceiver = str2;
        if (str3 != null) {
            MediaBrowserCompat$MediaItem.MediaBrowserCompat$MediaItem = str3;
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem);
    }
}

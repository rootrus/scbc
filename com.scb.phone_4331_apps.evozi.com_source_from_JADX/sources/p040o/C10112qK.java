package p040o;

import p040o.CheckParameters_MembersInjector;
import p040o.Synchronized;
import p040o.writeUInt64NoTag;

/* renamed from: o.qK */
public final /* synthetic */ class C10112qK implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setOnStreetViewPanoramaLongClickListener IconCompatParcelizer;
    private final /* synthetic */ setZoomOutMsg$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C10112qK(setZoomOutMsg$MediaBrowserCompat$ItemReceiver setzoomoutmsg_mediabrowsercompat_itemreceiver, setOnStreetViewPanoramaLongClickListener setonstreetviewpanoramalongclicklistener) {
        this.MediaBrowserCompat$ItemReceiver = setzoomoutmsg_mediabrowsercompat_itemreceiver;
        this.IconCompatParcelizer = setonstreetviewpanoramalongclicklistener;
    }

    public final void IconCompatParcelizer(Object obj) {
        setZoomOutMsg$MediaBrowserCompat$ItemReceiver setzoomoutmsg_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$ItemReceiver;
        setOnStreetViewPanoramaLongClickListener setonstreetviewpanoramalongclicklistener = this.IconCompatParcelizer;
        Synchronized.SynchronizedAsMapValues.C38371 RatingCompat = setzoomoutmsg_mediabrowsercompat_itemreceiver.write.MediaBrowserCompat$SearchResultReceiver;
        String str = setonstreetviewpanoramalongclicklistener.read;
        String string = RatingCompat.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.gifts_selection_title);
        setCurrentSession write = setCurrentSession.write();
        write.MediaBrowserCompat$MediaItem = string;
        write.MediaMetadataCompat = str;
        ((CheckParameters_MembersInjector.read) obj).read(write);
    }
}

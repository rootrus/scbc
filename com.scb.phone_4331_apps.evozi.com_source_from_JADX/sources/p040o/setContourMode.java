package p040o;

import p040o.Maps;
import p040o.writeUInt64NoTag;

/* renamed from: o.setContourMode */
public final /* synthetic */ class setContourMode implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ constrainedSet MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ KotlinDetector$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ setContourMode(KotlinDetector$MediaBrowserCompat$ItemReceiver kotlinDetector$MediaBrowserCompat$ItemReceiver, constrainedSet constrainedset) {
        this.read = kotlinDetector$MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = constrainedset;
    }

    public final void IconCompatParcelizer(Object obj) {
        KotlinDetector$MediaBrowserCompat$ItemReceiver kotlinDetector$MediaBrowserCompat$ItemReceiver = this.read;
        constrainedSet constrainedset = this.MediaBrowserCompat$CustomActionResultReceiver;
        getAddress5 getaddress5 = (getAddress5) obj;
        Maps.AbstractFilteredMap.Values.C36441 read2 = kotlinDetector$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
        String str = constrainedset.MediaBrowserCompat$ItemReceiver;
        chain RatingCompat = getaddress5.RatingCompat();
        getaddress5.read(read2.MediaBrowserCompat$ItemReceiver(str, RatingCompat.AppCompatViewInflater, RatingCompat.MediaSessionCompat$Token, getaddress5.MediaBrowserCompat$MediaItem(), getaddress5.mo36268x50fd9e4a(), getaddress5.MediaBrowserCompat$SearchResultReceiver(), KotlinDetector.IconCompatParcelizer(constrainedset, getaddress5), constrainedset.IconCompatParcelizer, false, RatingCompat.setShortcut));
    }
}

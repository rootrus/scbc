package p040o;

import p040o.IdType;
import p040o.writeUInt64NoTag;

/* renamed from: o.cr$MediaBrowserCompat$ItemReceiver */
public final class cr$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IdType.IconCompatParcelizer> {
    private /* synthetic */ setFilename IconCompatParcelizer;

    public cr$MediaBrowserCompat$ItemReceiver(setFilename setfilename) {
        this.IconCompatParcelizer = setfilename;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        IdType.IconCompatParcelizer iconCompatParcelizer = (IdType.IconCompatParcelizer) obj;
        iconCompatParcelizer.write(this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver, this.IconCompatParcelizer.MediaMetadataCompat, this.IconCompatParcelizer.IconCompatParcelizer, this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        iconCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer.MediaDescriptionCompat, this.IconCompatParcelizer.RatingCompat);
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.read);
        iconCompatParcelizer.read(!this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
    }
}

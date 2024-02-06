package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.modifyString$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C4975x77b511<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.IconCompatParcelizer> {
    private /* synthetic */ isValue IconCompatParcelizer;

    C4975x77b511(isValue isvalue) {
        this.IconCompatParcelizer = isvalue;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.IconCompatParcelizer iconCompatParcelizer = (getFirstName.IconCompatParcelizer) obj;
        iconCompatParcelizer.aj_();
        iconCompatParcelizer.IconCompatParcelizer(true);
        iconCompatParcelizer.MediaBrowserCompat$MediaItem(this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
        iconCompatParcelizer.read(this.IconCompatParcelizer.MediaMetadataCompat);
        iconCompatParcelizer.write(this.IconCompatParcelizer.RatingCompat);
        iconCompatParcelizer.MediaDescriptionCompat(this.IconCompatParcelizer.MediaDescriptionCompat);
    }
}

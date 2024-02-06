package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.readBooleanObject */
public final /* synthetic */ class readBooleanObject implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ readBooleanObject MediaBrowserCompat$CustomActionResultReceiver = new readBooleanObject();

    private /* synthetic */ readBooleanObject() {
    }

    public final Object write(Object obj) {
        C1251R r = (C1251R) ((SingleDataEntity) obj).getData();
        return new zzxa(r.MediaBrowserCompat$SearchResultReceiver, r.RatingCompat, r.MediaSessionCompat$QueueItem, r.read, r.IconCompatParcelizer, r.MediaBrowserCompat$ItemReceiver, r.MediaBrowserCompat$CustomActionResultReceiver, r.write, Double.parseDouble(r.MediaBrowserCompat$MediaItem), r.MediaMetadataCompat, r.MediaDescriptionCompat);
    }
}

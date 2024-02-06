package p040o;

import p040o.IdCaptureBackActivity;
import p040o.Maps;

/* renamed from: o.checkNotPrimitive */
public class checkNotPrimitive extends writeUInt64NoTag<isOcrRead> {
    public IdCaptureBackActivity.C69021 IconCompatParcelizer;
    public isEagerInDefaultApp MediaBrowserCompat$ItemReceiver;
    Maps.TransformedEntriesMap.EntrySet.C36501 write;

    @HmlPinActivity
    public checkNotPrimitive(RegularImmutableBiMap regularImmutableBiMap, Maps.TransformedEntriesMap.EntrySet.C36501 r2, Maps.ImprovedAbstractMap.C36492 r3) {
        super(regularImmutableBiMap);
        this.write = r2;
    }

    static /* synthetic */ void write(isOcrRead isocrread) {
        isocrread.MediaBrowserCompat$SearchResultReceiver();
        isocrread.MediaBrowserCompat$MediaItem();
        isocrread.read();
        isocrread.IconCompatParcelizer();
    }

    static /* synthetic */ void read(isEagerInDefaultApp iseagerindefaultapp, isOcrRead isocrread) {
        isocrread.MediaBrowserCompat$SearchResultReceiver();
        isocrread.MediaBrowserCompat$CustomActionResultReceiver();
        isocrread.MediaDescriptionCompat();
        if (iseagerindefaultapp.MediaMetadataCompat) {
            isocrread.write();
        } else {
            isocrread.IconCompatParcelizer();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(isOcrRead isocrread) {
        isocrread.RatingCompat();
        isocrread.MediaBrowserCompat$CustomActionResultReceiver();
    }

    static boolean MediaBrowserCompat$CustomActionResultReceiver(isEagerInDefaultApp iseagerindefaultapp) {
        return Integer.parseInt(iseagerindefaultapp.MediaSessionCompat$Token.replaceAll(",", "")) < iseagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper.PlaybackStateCompat$CustomAction.intValue();
    }
}

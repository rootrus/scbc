package p040o;

import p040o.AbstractBiMap;
import p040o.C3088x7e3e3ebd;
import p040o.writeUInt64NoTag;

/* renamed from: o.isTargetRectangleFilled */
public final class isTargetRectangleFilled extends writeUInt64NoTag<IdExtractor_MembersInjector> {
    public final AbstractBiMap.KeySet MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.isTargetRectangleFilled$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor_MembersInjector> {
        private /* synthetic */ Throwable write;

        IconCompatParcelizer(Throwable th) {
            this.write = th;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdExtractor_MembersInjector) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write);
        }
    }

    /* renamed from: o.isTargetRectangleFilled$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor_MembersInjector> {
        private /* synthetic */ C3088x7e3e3ebd.C30891 MediaBrowserCompat$ItemReceiver;

        write(C3088x7e3e3ebd.C30891 r1) {
            this.MediaBrowserCompat$ItemReceiver = r1;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdExtractor_MembersInjector) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public isTargetRectangleFilled(RegularImmutableBiMap regularImmutableBiMap, AbstractBiMap.KeySet keySet, isPublicSuffix ispublicsuffix) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) keySet, "retryCase");
        onGetStartedClick.write((Object) ispublicsuffix, "remittanceInputDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = keySet;
    }

    public static final /* synthetic */ void read(isTargetRectangleFilled istargetrectanglefilled, Throwable th) {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(th);
        if (istargetrectanglefilled.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(istargetrectanglefilled.RatingCompat);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(isTargetRectangleFilled istargetrectanglefilled, zOrderOnTop zorderontop) {
        isTargetRectangleFilled istargetrectanglefilled2 = istargetrectanglefilled;
        zOrderOnTop zorderontop2 = zorderontop;
        boolean z = true;
        if (istargetrectanglefilled2.RatingCompat != null) {
            istargetrectanglefilled2.RatingCompat.aj_();
        }
        onGetStartedClick.write((Object) zorderontop2, "retryResponse");
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(new C3088x7e3e3ebd.C30891(zorderontop2.IconCompatParcelizer, zorderontop2.write, zorderontop2.MediaBrowserCompat$ItemReceiver, zorderontop2.MediaBrowserCompat$CustomActionResultReceiver, zorderontop2.MediaBrowserCompat$SearchResultReceiver, zorderontop2.read.PlaybackStateCompat, zorderontop2.read.IconCompatParcelizer, zorderontop2.read.MediaBrowserCompat$CustomActionResultReceiver, zorderontop2.read.MediaBrowserCompat$ItemReceiver, zorderontop2.read.setHasDecor, zorderontop2.read.PlaybackStateCompat$CustomAction, zorderontop2.read.RatingCompat, zorderontop2.read.MediaSessionCompat$QueueItem, zorderontop2.read.MediaSessionCompat$ResultReceiverWrapper, zorderontop2.read.MediaBrowserCompat$MediaItem, zorderontop2.read.MediaMetadataCompat, zorderontop2.read.write, zorderontop2.read.read, zorderontop2.read.Keep, zorderontop2.read.MediaSessionCompat$Token, zorderontop2.read.MediaDescriptionCompat, zorderontop2.read.ParcelableVolumeInfo, zorderontop2.read.MediaBrowserCompat$SearchResultReceiver, zorderontop2.read.f2907x50fd9e4a, (String) null));
        if (istargetrectanglefilled2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            write2.IconCompatParcelizer(istargetrectanglefilled2.RatingCompat);
        }
    }
}

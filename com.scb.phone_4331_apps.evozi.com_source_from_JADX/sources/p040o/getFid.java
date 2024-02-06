package p040o;

import p040o.Synchronized;
import p040o.access$2300;

/* renamed from: o.getFid */
public class getFid extends writeUInt64NoTag<proxyGetICheckDeserializerRtti$MediaBrowserCompat$MediaItem> {
    public UncaughtExceptionHandlers IconCompatParcelizer;
    public final MapStyleOptions MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final Synchronized.SynchronizedSet write;

    @HmlPinActivity
    public getFid(RegularImmutableBiMap regularImmutableBiMap, Synchronized.SynchronizedSet synchronizedSet, MapStyleOptions mapStyleOptions) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = mapStyleOptions;
        this.write = synchronizedSet;
    }

    /* renamed from: o.getFid$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Object> {
        private read() {
        }

        public /* synthetic */ read(getFid getfid, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            getFid getfid = getFid.this;
            getfid.MediaBrowserCompat$ItemReceiver(getfid.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final void onNext(Object obj) {
            getFid.MediaBrowserCompat$ItemReceiver(getFid.this);
            getFid getfid = getFid.this;
            onStateReached onstatereached = onStateReached.MediaBrowserCompat$ItemReceiver;
            if (getfid.RatingCompat != null) {
                onstatereached.IconCompatParcelizer(getfid.RatingCompat);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getFid getfid) {
        if (getfid.RatingCompat != null) {
            getfid.RatingCompat.aj_();
        }
    }
}

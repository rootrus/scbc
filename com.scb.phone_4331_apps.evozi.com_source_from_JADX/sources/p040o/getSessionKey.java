package p040o;

import p040o.AppStatistics;
import p040o.access$2300;
import p040o.getTransit;

/* renamed from: o.getSessionKey */
public class getSessionKey extends writeUInt64NoTag<getTransit.write> {
    /* access modifiers changed from: private */
    public final getRowKey IconCompatParcelizer;
    public final matchesAllOf MediaBrowserCompat$ItemReceiver;
    public boolean read;
    public setUuidFromUtf8Bytes write;

    @HmlPinActivity
    public getSessionKey(RegularImmutableBiMap regularImmutableBiMap, matchesAllOf matchesallof, getRowKey getrowkey) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = matchesallof;
        this.IconCompatParcelizer = getrowkey;
    }

    /* renamed from: o.getSessionKey$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onStreetViewPanoramaLongClick> {
        String MediaBrowserCompat$CustomActionResultReceiver;

        public final /* synthetic */ void onNext(Object obj) {
            getSessionKey getsessionkey = getSessionKey.this;
            AppStatistics.ExportStatusEvent exportStatusEvent = new AppStatistics.ExportStatusEvent(this, (onStreetViewPanoramaLongClick) obj);
            if (getsessionkey.RatingCompat != null) {
                exportStatusEvent.IconCompatParcelizer(getsessionkey.RatingCompat);
            }
            boolean unused = getSessionKey.this.read = false;
        }

        public write(String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final void onError(Throwable th) {
            getSessionKey getsessionkey = getSessionKey.this;
            getsessionkey.MediaBrowserCompat$ItemReceiver(getsessionkey.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
            boolean unused = getSessionKey.this.read = false;
        }
    }
}

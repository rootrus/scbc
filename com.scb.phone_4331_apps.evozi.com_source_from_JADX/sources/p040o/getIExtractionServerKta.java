package p040o;

import java.util.List;
import p040o.Synchronized;
import p040o.access$2300;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.getIExtractionServerKta */
public class getIExtractionServerKta extends writeUInt64NoTag<getTopLeftCornerWidth.setCheckable> {
    /* access modifiers changed from: package-private */
    public setUuidFromUtf8Bytes IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final notifyFailed MediaBrowserCompat$MediaItem;
    public parseEventSignal MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final notifyStarted MediaDescriptionCompat;
    public final getAppIdOrigin MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final SignedBytes ParcelableVolumeInfo;
    public boolean read = false;
    final Synchronized.SynchronizedSet write;

    @HmlPinActivity
    public getIExtractionServerKta(getAppIdOrigin getappidorigin, notifyStarted notifystarted, notifyFailed notifyfailed, RegularImmutableBiMap regularImmutableBiMap, Synchronized.SynchronizedSet synchronizedSet, SignedBytes signedBytes) {
        super(regularImmutableBiMap);
        this.MediaMetadataCompat = getappidorigin;
        this.MediaDescriptionCompat = notifystarted;
        this.MediaBrowserCompat$MediaItem = notifyfailed;
        this.write = synchronizedSet;
        this.ParcelableVolumeInfo = signedBytes;
        this.MediaBrowserCompat$ItemReceiver = false;
    }

    /* renamed from: o.getIExtractionServerKta$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<newLatLngBoundsWithSize> {
        private read() {
        }

        public /* synthetic */ read(getIExtractionServerKta getiextractionserverkta, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            newLatLngBoundsWithSize newlatlngboundswithsize = (newLatLngBoundsWithSize) obj;
            boolean z = false;
            getIExtractionServerKta.this.MediaBrowserCompat$ItemReceiver = false;
            if (getIExtractionServerKta.this.RatingCompat != null) {
                double doubleValue = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(getIExtractionServerKta.this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem).doubleValue();
                if (doubleValue >= newlatlngboundswithsize.MediaBrowserCompat$CustomActionResultReceiver.doubleValue()) {
                    doubleValue = newlatlngboundswithsize.MediaBrowserCompat$CustomActionResultReceiver.doubleValue();
                }
                newlatlngboundswithsize.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(doubleValue);
                if (getIExtractionServerKta.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver() || getIExtractionServerKta.this.read) {
                    getIExtractionServerKta getiextractionserverkta = getIExtractionServerKta.this;
                    getExceptionKey getexceptionkey = new getExceptionKey(this, newlatlngboundswithsize);
                    if (getiextractionserverkta.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        getexceptionkey.IconCompatParcelizer(getiextractionserverkta.RatingCompat);
                        return;
                    }
                    return;
                }
                getIExtractionServerKta getiextractionserverkta2 = getIExtractionServerKta.this;
                getParametersInstance getparametersinstance = new getParametersInstance(this, newlatlngboundswithsize);
                if (getiextractionserverkta2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getparametersinstance.IconCompatParcelizer(getiextractionserverkta2.RatingCompat);
                }
            }
        }

        public final void onComplete() {
            getIExtractionServerKta.read(getIExtractionServerKta.this);
        }

        public final void onError(Throwable th) {
            getIExtractionServerKta.this.MediaBrowserCompat$ItemReceiver(getIExtractionServerKta.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    /* renamed from: o.getIExtractionServerKta$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<Integer>> {
        private write() {
        }

        public /* synthetic */ write(getIExtractionServerKta getiextractionserverkta, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            boolean z = false;
            getIExtractionServerKta.this.MediaBrowserCompat$ItemReceiver = false;
            if (getIExtractionServerKta.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver() || getIExtractionServerKta.this.read) {
                getIExtractionServerKta getiextractionserverkta = getIExtractionServerKta.this;
                C7503tM tMVar = new C7503tM(list);
                if (getiextractionserverkta.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    tMVar.IconCompatParcelizer(getiextractionserverkta.RatingCompat);
                    return;
                }
                return;
            }
            getIExtractionServerKta getiextractionserverkta2 = getIExtractionServerKta.this;
            C7504tN tNVar = new C7504tN(list);
            if (getiextractionserverkta2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                tNVar.IconCompatParcelizer(getiextractionserverkta2.RatingCompat);
            }
        }

        public final void onComplete() {
            getIExtractionServerKta.MediaBrowserCompat$MediaItem(getIExtractionServerKta.this);
        }

        public final void onError(Throwable th) {
            getIExtractionServerKta.this.MediaBrowserCompat$ItemReceiver(getIExtractionServerKta.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    static /* synthetic */ void read(getIExtractionServerKta getiextractionserverkta) {
        if (getiextractionserverkta.RatingCompat != null) {
            getiextractionserverkta.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(getIExtractionServerKta getiextractionserverkta) {
        if (getiextractionserverkta.RatingCompat != null) {
            getiextractionserverkta.RatingCompat.ay_();
        }
    }
}

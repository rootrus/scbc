package p040o;

import android.text.TextUtils;
import p040o.AppMeasurementSdk;
import p040o.AppStatistics;
import p040o.Futures;
import p040o.Synchronized;
import p040o.access$2300;

/* renamed from: o.removeDataStoreInitializedListener */
public class removeDataStoreInitializedListener extends writeUInt64NoTag<getEpc> {
    public String IconCompatParcelizer;
    public double MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final negate f2927x50fd9e4a;
    public String MediaDescriptionCompat;
    public Futures.C34051 MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final Synchronized.SynchronizedSortedSetMultimap MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public final Synchronized.SynchronizedAsMapEntries.C38351.C38361 MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: package-private */
    public setUuidFromUtf8Bytes MediaSessionCompat$Token;
    public final AppMeasurementSdk.OnEventListener ParcelableVolumeInfo;
    public String read;
    public String write;

    @HmlPinActivity
    public removeDataStoreInitializedListener(RegularImmutableBiMap regularImmutableBiMap, AppMeasurementSdk.OnEventListener onEventListener, negate negate, Synchronized.SynchronizedAsMapEntries.C38351.C38361 r4, Synchronized.SynchronizedSortedSetMultimap synchronizedSortedSetMultimap) {
        super(regularImmutableBiMap);
        this.ParcelableVolumeInfo = onEventListener;
        this.f2927x50fd9e4a = negate;
        this.MediaSessionCompat$ResultReceiverWrapper = r4;
        this.MediaSessionCompat$QueueItem = synchronizedSortedSetMultimap;
    }

    static /* synthetic */ void IconCompatParcelizer(Futures.C34051 r1, getEpc getepc) {
        getepc.IconCompatParcelizer(false);
        getepc.MediaBrowserCompat$ItemReceiver(r1);
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getEpc getepc) {
        getepc.PlaybackStateCompat$CustomAction();
        getepc.AlertController$RecycleListView();
    }

    static boolean write(String str, String str2, double d) {
        return !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && d >= getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).doubleValue() && getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).doubleValue() > 0.0d;
    }

    /* renamed from: o.removeDataStoreInitializedListener$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzvt> {
        private String IconCompatParcelizer;
        private String MediaBrowserCompat$CustomActionResultReceiver;
        private String MediaBrowserCompat$ItemReceiver;
        private final String MediaDescriptionCompat;
        private String write;

        public final /* synthetic */ void onNext(Object obj) {
            zzvt zzvt = (zzvt) obj;
            removeDataStoreInitializedListener removedatastoreinitializedlistener = removeDataStoreInitializedListener.this;
            AppStatistics.DataStoreStatusCallback dataStoreStatusCallback = AppStatistics.DataStoreStatusCallback.MediaBrowserCompat$CustomActionResultReceiver;
            boolean z = true;
            if (removedatastoreinitializedlistener.RatingCompat != null) {
                dataStoreStatusCallback.IconCompatParcelizer(removedatastoreinitializedlistener.RatingCompat);
            }
            removeDataStoreInitializedListener removedatastoreinitializedlistener2 = removeDataStoreInitializedListener.this;
            setUuidFromUtf8Bytes unused = removedatastoreinitializedlistener2.MediaSessionCompat$Token = removedatastoreinitializedlistener2.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver(zzvt, this.MediaDescriptionCompat, removeDataStoreInitializedListener.this.ParcelableVolumeInfo.IconCompatParcelizer.setItemInvoker(), this.write, removeDataStoreInitializedListener.this.f2927x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver.AppCompatActivity(), this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver);
            if (zzvt.MediaBrowserCompat$ItemReceiver) {
                removeDataStoreInitializedListener removedatastoreinitializedlistener3 = removeDataStoreInitializedListener.this;
                getAppStatsDataStore getappstatsdatastore = getAppStatsDataStore.IconCompatParcelizer;
                if (removedatastoreinitializedlistener3.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getappstatsdatastore.IconCompatParcelizer(removedatastoreinitializedlistener3.RatingCompat);
                }
            } else {
                removeDataStoreInitializedListener removedatastoreinitializedlistener4 = removeDataStoreInitializedListener.this;
                writeToFile writetofile = new writeToFile(this);
                if (removedatastoreinitializedlistener4.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    writetofile.IconCompatParcelizer(removedatastoreinitializedlistener4.RatingCompat);
                }
            }
            boolean unused2 = removeDataStoreInitializedListener.this.MediaBrowserCompat$SearchResultReceiver = false;
        }

        public IconCompatParcelizer(String str, String str2, String str3, String str4, String str5) {
            this.MediaDescriptionCompat = str;
            this.write = str2;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.IconCompatParcelizer = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        }

        public final void onError(Throwable th) {
            removeDataStoreInitializedListener.this.MediaBrowserCompat$ItemReceiver(removeDataStoreInitializedListener.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            boolean unused = removeDataStoreInitializedListener.this.MediaBrowserCompat$SearchResultReceiver = false;
        }
    }
}

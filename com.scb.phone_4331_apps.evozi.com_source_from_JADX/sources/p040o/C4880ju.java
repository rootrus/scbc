package p040o;

import android.content.SharedPreferences;
import okhttp3.internal.cache.DiskLruCache;
import p040o.GoogleMap;
import p040o.access$2300;

/* renamed from: o.ju */
public class C4880ju extends writeUInt64NoTag<QuickExtractor> {
    public FinalizableReference IconCompatParcelizer;
    public final trimResults MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public readUnsignedShort MediaBrowserCompat$SearchResultReceiver;
    public final SharedPreferences read;
    public finalizeReferent write;

    @HmlPinActivity
    public C4880ju(finalizeReferent finalizereferent, FinalizableReference finalizableReference, readUnsignedShort readunsignedshort, trimResults trimresults, RegularImmutableBiMap regularImmutableBiMap, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tokenCache") SharedPreferences sharedPreferences) {
        super(regularImmutableBiMap);
        this.write = finalizereferent;
        this.IconCompatParcelizer = finalizableReference;
        this.MediaBrowserCompat$SearchResultReceiver = readunsignedshort;
        this.MediaBrowserCompat$ItemReceiver = trimresults;
        this.read = sharedPreferences;
    }

    /* renamed from: o.ju$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver {
        String MediaBrowserCompat$CustomActionResultReceiver;
        String MediaBrowserCompat$ItemReceiver;
        boolean read;

        public write(boolean z, String str, String str2) {
            this.read = z;
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }

        public final void onComplete() {
            GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = C4880ju.this.IconCompatParcelizer.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView();
            if (AppCompatDelegateImpl$ListMenuDecorView != null && "EMAIL".equals(this.MediaBrowserCompat$ItemReceiver)) {
                AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$MediaItem = this.read ? DiskLruCache.VERSION_1 : "0";
            }
            C4880ju.IconCompatParcelizer(C4880ju.this);
            C4880ju juVar = C4880ju.this;
            getNationalityFieldName getnationalityfieldname = new getNationalityFieldName(this);
            if (juVar.RatingCompat != null) {
                getnationalityfieldname.IconCompatParcelizer(juVar.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            C4880ju.MediaBrowserCompat$MediaItem(C4880ju.this);
            C4880ju juVar = C4880ju.this;
            juVar.MediaBrowserCompat$ItemReceiver(juVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            C4880ju juVar2 = C4880ju.this;
            getStateFieldName getstatefieldname = new getStateFieldName(this);
            if (juVar2.RatingCompat != null) {
                getstatefieldname.IconCompatParcelizer(juVar2.RatingCompat);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4880ju juVar) {
        if (juVar.RatingCompat != null) {
            juVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(C4880ju juVar) {
        if (juVar.RatingCompat != null) {
            juVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4880ju juVar) {
        if (juVar.RatingCompat != null) {
            juVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(C4880ju juVar) {
        if (juVar.RatingCompat != null) {
            juVar.RatingCompat.aj_();
        }
    }
}

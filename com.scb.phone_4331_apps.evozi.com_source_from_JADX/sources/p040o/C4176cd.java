package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.Iterables;
import p040o.KtaJsonCheck;
import p040o.access$2300;

/* renamed from: o.cd */
public class C4176cd extends writeUInt64NoTag<KtaJsonCheck.RatingCompat> {
    final getIdType IconCompatParcelizer;
    /* access modifiers changed from: package-private */
    public final addHole MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final getInput MediaBrowserCompat$MediaItem;
    final List<String> MediaBrowserCompat$SearchResultReceiver = Arrays.asList(new String[]{"RP_INITIAL", "RP_PERSONAL_INFO", "RP_COMPLETE", "RP_CID_VERIFIED", "RP_PENDING", "RP_LIVENESS"});
    public boolean MediaDescriptionCompat;
    public List<access$lambda$0> MediaMetadataCompat;
    public final Iterables.C352212 read;
    final List<String> write = Arrays.asList(new String[]{"0", DiskLruCache.VERSION_1, "2"});

    @HmlPinActivity
    public C4176cd(RegularImmutableBiMap regularImmutableBiMap, addHole addhole, getInput getinput, getIdType getidtype, Iterables.C352212 r11) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = addhole;
        this.MediaBrowserCompat$MediaItem = getinput;
        this.IconCompatParcelizer = getidtype;
        this.read = r11;
    }

    public void onDestroy() {
        addHole addhole = this.MediaBrowserCompat$ItemReceiver;
        if (!addhole.MediaBrowserCompat$MediaItem.isDisposed()) {
            addhole.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(String str, KtaJsonCheck.RatingCompat ratingCompat) {
        if (Iterables.C35284.NTB_LIFE_STYLE_LANDING.name().equals(str) || Iterables.C35284.NTB_WELCOME_ABOARD.name().equals(str)) {
            ratingCompat.write();
        } else if (Iterables.C35284.BANKING_SERVICES.name().equals(str)) {
            ratingCompat.MediaBrowserCompat$CustomActionResultReceiver();
        } else if (Iterables.C35284.ETB_WELCOME_ABOARD.name().equals(str)) {
            ratingCompat.IconCompatParcelizer();
        }
    }

    /* renamed from: o.cd$read */
    class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getProjection> {
        read() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4176cd.MediaBrowserCompat$CustomActionResultReceiver(C4176cd.this);
            AutoValue_CrashlyticsReport_CustomAttribute.Builder MediaBrowserCompat$CustomActionResultReceiver = C4176cd.this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver((getProjection) obj, C4176cd.this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setCheckable());
            boolean z = true;
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                C4176cd cdVar = C4176cd.this;
                C4163cZ cZVar = C4163cZ.IconCompatParcelizer;
                if (cdVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    cZVar.IconCompatParcelizer(cdVar.RatingCompat);
                }
            } else if (C4176cd.this.MediaDescriptionCompat) {
                C4176cd cdVar2 = C4176cd.this;
                C4072bL bLVar = C4072bL.read;
                if (cdVar2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    bLVar.IconCompatParcelizer(cdVar2.RatingCompat);
                }
            } else {
                C4176cd cdVar3 = C4176cd.this;
                getLocalProjectProvider getlocalprojectprovider = new getLocalProjectProvider(cdVar3, MediaBrowserCompat$CustomActionResultReceiver);
                if (cdVar3.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getlocalprojectprovider.IconCompatParcelizer(cdVar3.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            C4176cd.read(C4176cd.this);
            if (th instanceof RetrofitException) {
                RetrofitException retrofitException = (RetrofitException) th;
                if (!(retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null || retrofitException.IconCompatParcelizer.write.IconCompatParcelizer == null || !"3001".equals(retrofitException.IconCompatParcelizer.write.IconCompatParcelizer))) {
                    C4176cd cdVar = C4176cd.this;
                    getRttiExtraction getrttiextraction = new getRttiExtraction(this, th);
                    if (cdVar.RatingCompat != null) {
                        getrttiextraction.IconCompatParcelizer(cdVar.RatingCompat);
                        return;
                    }
                    return;
                }
            }
            C4176cd.this.MediaBrowserCompat$ItemReceiver(C4176cd.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void read(KtaJsonCheck.RatingCompat ratingCompat) {
        ratingCompat.MediaMetadataCompat();
        ratingCompat.MediaBrowserCompat$ItemReceiver();
    }

    static boolean IconCompatParcelizer(String str) {
        return Arrays.asList(new String[]{"TOUCHPOINT_INITIAL", "TOUCHPOINT_VERIFIED", "TOUCHPOINT_COMPLETE"}).contains(str);
    }

    static /* synthetic */ void read(C4176cd cdVar) {
        if (cdVar.RatingCompat != null) {
            cdVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4176cd cdVar) {
        if (cdVar.RatingCompat != null) {
            cdVar.RatingCompat.aj_();
        }
    }
}

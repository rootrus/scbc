package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.CheckUsabilityData;
import p040o.access$2300;
import p040o.zzbc;

/* renamed from: o.getFirstPassTexelWidthUniform */
public class getFirstPassTexelWidthUniform extends writeUInt64NoTag<CheckUsabilityData> {
    public final DynamiteClearcutLogger IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final PeekingIterator MediaBrowserCompat$MediaItem;
    public final C6982x2b4da6be MediaDescriptionCompat;
    public boolean MediaMetadataCompat = false;
    public CheckUsabilityData.write read;
    public List<String> write;

    @HmlPinActivity
    public getFirstPassTexelWidthUniform(RegularImmutableBiMap regularImmutableBiMap, DynamiteClearcutLogger dynamiteClearcutLogger, C6982x2b4da6be passportCaptureModule_PassportOnDeviceExtractionServer_MembersInjector, PeekingIterator peekingIterator) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = dynamiteClearcutLogger;
        this.MediaDescriptionCompat = passportCaptureModule_PassportOnDeviceExtractionServer_MembersInjector;
        this.MediaBrowserCompat$MediaItem = peekingIterator;
    }

    /* renamed from: o.getFirstPassTexelWidthUniform$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzbc.zzd> {
        private read() {
        }

        public /* synthetic */ read(getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzbc.zzd zzd = (zzbc.zzd) obj;
            getFirstPassTexelWidthUniform.IconCompatParcelizer(getFirstPassTexelWidthUniform.this);
            if (zzd != null) {
                PeekingIterator RatingCompat = getFirstPassTexelWidthUniform.this.MediaBrowserCompat$MediaItem;
                onGetStartedClick.write((Object) zzd, "checkEligibility");
                String str = zzd.IconCompatParcelizer;
                String str2 = zzd.MediaBrowserCompat$ItemReceiver;
                Iterable<zzbc.zzc> iterable = zzd.write;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (zzbc.zzc zzc : iterable) {
                    String c_ = RatingCompat.mo26549c_(zzc.write);
                    onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(it.imageUrl)");
                    arrayList.add(new access$2400(c_, zzc.IconCompatParcelizer));
                }
                access$1500 access_1500 = new access$1500(str, str2, (List) arrayList, zzd.MediaBrowserCompat$CustomActionResultReceiver);
                getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform = getFirstPassTexelWidthUniform.this;
                C3919U u = new C3919U(access_1500);
                if (getfirstpasstexelwidthuniform.RatingCompat != null) {
                    u.IconCompatParcelizer(getfirstpasstexelwidthuniform.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            getFirstPassTexelWidthUniform.MediaBrowserCompat$CustomActionResultReceiver(getFirstPassTexelWidthUniform.this);
            getFirstPassTexelWidthUniform.this.MediaBrowserCompat$ItemReceiver(getFirstPassTexelWidthUniform.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }

        static /* synthetic */ void IconCompatParcelizer(access$1500 access_1500, CheckUsabilityData checkUsabilityData) {
            checkUsabilityData.IconCompatParcelizer(access_1500.IconCompatParcelizer);
            checkUsabilityData.read(access_1500.MediaBrowserCompat$CustomActionResultReceiver);
            checkUsabilityData.MediaBrowserCompat$ItemReceiver(access_1500.MediaBrowserCompat$ItemReceiver);
            checkUsabilityData.read(access_1500.read);
        }
    }

    static /* synthetic */ void read(getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform) {
        if (getfirstpasstexelwidthuniform.RatingCompat != null) {
            getfirstpasstexelwidthuniform.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform) {
        if (getfirstpasstexelwidthuniform.RatingCompat != null) {
            getfirstpasstexelwidthuniform.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform) {
        if (getfirstpasstexelwidthuniform.RatingCompat != null) {
            getfirstpasstexelwidthuniform.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform) {
        if (getfirstpasstexelwidthuniform.RatingCompat != null) {
            getfirstpasstexelwidthuniform.RatingCompat.aj_();
        }
    }
}

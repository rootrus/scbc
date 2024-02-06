package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzct;
import p040o.zzjx;

/* renamed from: o.KofaxWebServiceResponseBase */
public final class KofaxWebServiceResponseBase extends writeUInt64NoTag<PassportCaptureModule_GetIParametersFactory> {
    private final TabLayout IconCompatParcelizer;
    private final setLiftOnScroll read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public KofaxWebServiceResponseBase(RegularImmutableBiMap regularImmutableBiMap, setLiftOnScroll setliftonscroll, TabLayout tabLayout) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setliftonscroll, "hmlCtaGetSetupResultCase");
        onGetStartedClick.write((Object) tabLayout, "hmlSetCustomerTypeCase");
        this.read = setliftonscroll;
        this.IconCompatParcelizer = tabLayout;
    }

    /* renamed from: o.KofaxWebServiceResponseBase$write */
    public static final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzjx.zze> {
        private /* synthetic */ KofaxWebServiceResponseBase IconCompatParcelizer;

        write(KofaxWebServiceResponseBase kofaxWebServiceResponseBase) {
            this.IconCompatParcelizer = kofaxWebServiceResponseBase;
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzjx.zze zze = (zzjx.zze) obj;
            onGetStartedClick.write((Object) zze, "t");
            super.onNext(zze);
            KofaxWebServiceResponseBase.read(this.IconCompatParcelizer);
            KofaxWebServiceResponseBase kofaxWebServiceResponseBase = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C3560x619007e3.write;
            if (kofaxWebServiceResponseBase.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(kofaxWebServiceResponseBase.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            super.onError(th);
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    public final void onDestroy() {
        setLiftOnScroll setliftonscroll = this.read;
        if (!setliftonscroll.MediaBrowserCompat$MediaItem.isDisposed()) {
            setliftonscroll.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void read(KofaxWebServiceResponseBase kofaxWebServiceResponseBase) {
        if (kofaxWebServiceResponseBase.RatingCompat != null) {
            kofaxWebServiceResponseBase.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, boolean z) {
        onGetStartedClick.write((Object) str, "deepLinkId");
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        if (z) {
            TabLayout tabLayout = this.IconCompatParcelizer;
            zzct.zza zza = zzct.zza.BUSINESS_OWNER;
            onGetStartedClick.write((Object) zza, "type");
            tabLayout.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(zza);
        } else {
            TabLayout tabLayout2 = this.IconCompatParcelizer;
            zzct.zza zza2 = zzct.zza.CONSUMER;
            onGetStartedClick.write((Object) zza2, "type");
            tabLayout2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(zza2);
        }
        setLiftOnScroll setliftonscroll = this.read;
        setliftonscroll.write(setliftonscroll.read(str), new write(this));
    }
}

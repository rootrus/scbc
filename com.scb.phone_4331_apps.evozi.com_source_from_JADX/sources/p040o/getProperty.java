package p040o;

import p040o.access$2300;
import p040o.zzca;

/* renamed from: o.getProperty */
public final class getProperty extends writeUInt64NoTag<PassportCaptureModule_GetIExtractionServerKtaFactory> {
    private final setExpanded read;
    /* access modifiers changed from: private */
    public final FloatingActionButton write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getProperty(RegularImmutableBiMap regularImmutableBiMap, setExpanded setexpanded, FloatingActionButton floatingActionButton) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setexpanded, "hmlCtaGetPersonalInformationCase");
        onGetStartedClick.write((Object) floatingActionButton, "hmlSaveContactInfoCase");
        this.read = setexpanded;
        this.write = floatingActionButton;
    }

    /* renamed from: o.getProperty$read */
    public static final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzca.zzf.zza> {
        final /* synthetic */ getProperty MediaBrowserCompat$CustomActionResultReceiver;

        read(getProperty getproperty) {
            this.MediaBrowserCompat$CustomActionResultReceiver = getproperty;
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzca.zzf.zza zza = (zzca.zzf.zza) obj;
            onGetStartedClick.write((Object) zza, "contactInfo");
            super.onNext(zza);
            this.MediaBrowserCompat$CustomActionResultReceiver.write.write(this.MediaBrowserCompat$CustomActionResultReceiver.write.IconCompatParcelizer(zza), new getProperty$read$MediaBrowserCompat$CustomActionResultReceiver(this));
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            super.onError(th);
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    public final void onDestroy() {
        setExpanded setexpanded = this.read;
        if (!setexpanded.MediaBrowserCompat$MediaItem.isDisposed()) {
            setexpanded.MediaBrowserCompat$MediaItem.dispose();
        }
        FloatingActionButton floatingActionButton = this.write;
        if (!floatingActionButton.MediaBrowserCompat$MediaItem.isDisposed()) {
            floatingActionButton.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void write(getProperty getproperty) {
        if (getproperty.RatingCompat != null) {
            getproperty.RatingCompat.aj_();
        }
    }

    public final void read(String str) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        setExpanded setexpanded = this.read;
        setexpanded.write(setexpanded.MediaBrowserCompat$ItemReceiver(str), new read(this));
    }
}

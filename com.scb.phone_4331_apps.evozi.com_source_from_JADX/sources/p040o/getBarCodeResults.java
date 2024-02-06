package p040o;

import p040o.CameraSource;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CustomConcurrentHashMap;
import p040o.access$2300;

/* renamed from: o.getBarCodeResults */
public class getBarCodeResults extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.ExpandedMenuView> {
    private final setFabAlignmentMode IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final ObjectArrays MediaBrowserCompat$ItemReceiver;
    public final CameraSource.zze read;
    private Boolean write = Boolean.FALSE;

    @HmlPinActivity
    public getBarCodeResults(RegularImmutableBiMap regularImmutableBiMap, CameraSource.zze zze, ObjectArrays objectArrays, setFabAlignmentMode setfabalignmentmode) {
        super(regularImmutableBiMap);
        this.read = zze;
        this.MediaBrowserCompat$ItemReceiver = objectArrays;
        this.IconCompatParcelizer = setfabalignmentmode;
    }

    /* renamed from: o.getBarCodeResults$write */
    class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private write() {
        }

        /* synthetic */ write(getBarCodeResults getbarcoderesults, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            getBarCodeResults.this.MediaBrowserCompat$ItemReceiver(getBarCodeResults.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            getBarCodeResults.MediaBrowserCompat$ItemReceiver(getBarCodeResults.this);
            getBarCodeResults getbarcoderesults = getBarCodeResults.this;
            C10835getBarcode getbarcode = C10835getBarcode.MediaBrowserCompat$ItemReceiver;
            if (getbarcoderesults.RatingCompat != null) {
                getbarcode.IconCompatParcelizer(getbarcoderesults.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getBarCodeResults getbarcoderesults) {
        if (getbarcoderesults.RatingCompat != null) {
            getbarcoderesults.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getBarCodeResults getbarcoderesults) {
        if (getbarcoderesults.RatingCompat != null) {
            getbarcoderesults.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        if (this.write.booleanValue() || str2 == null) {
            this.IconCompatParcelizer.IconCompatParcelizer(str);
            this.IconCompatParcelizer.IconCompatParcelizer(new write(this, (byte) 0));
            return;
        }
        this.read.read(new CustomConcurrentHashMap.EntryIterator(str2, str));
        this.read.IconCompatParcelizer(new write(this, (byte) 0));
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, Boolean bool) {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        this.write = bool;
        if (bool.booleanValue()) {
            this.IconCompatParcelizer.write();
            this.IconCompatParcelizer.IconCompatParcelizer(new getBarCodeResults$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
            return;
        }
        this.read.read(str);
        this.read.IconCompatParcelizer(new getBarCodeResults$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
    }
}

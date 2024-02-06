package p040o;

import java.util.List;
import p040o.access$2300;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.eq */
public class C4381eq extends writeUInt64NoTag<getTopLeftCornerWidth.setBackgroundResource> {
    public final notNull IconCompatParcelizer;
    /* access modifiers changed from: private */
    public AutoValue_CrashlyticsReport_Session_Application_Organization MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final getSupplier read;
    public final AppMeasurement write;

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(CheckCaptureModule_GetICheckDeserializerRttiFactory checkCaptureModule_GetICheckDeserializerRttiFactory) {
        super.MediaBrowserCompat$ItemReceiver((getTopLeftCornerWidth.setBackgroundResource) checkCaptureModule_GetICheckDeserializerRttiFactory);
        C4364ed edVar = C4364ed.write;
        if (this.RatingCompat != null) {
            edVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    @HmlPinActivity
    public C4381eq(AppMeasurement appMeasurement, notNull notnull, getSupplier getsupplier, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = appMeasurement;
        this.IconCompatParcelizer = notnull;
        this.read = getsupplier;
    }

    public final void write(getTopLeftCornerWidth.setBackgroundResource setbackgroundresource) {
        super.MediaBrowserCompat$ItemReceiver(setbackgroundresource);
        C4364ed edVar = C4364ed.write;
        if (this.RatingCompat != null) {
            edVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(long j, getGeoDataClient getgeodataclient) {
        Hashing write2 = Hashing.write();
        write2.IconCompatParcelizer = getgeodataclient.toString();
        write2.write = setLocale.SHORTCUT.toString();
        write2.MediaBrowserCompat$CustomActionResultReceiver = j;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.write.write(write2);
        this.write.IconCompatParcelizer(new IconCompatParcelizer(j));
    }

    /* renamed from: o.eq$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<onInfoWindowLongClick>> {
        public final void onComplete() {
        }

        public final void onError(Throwable th) {
        }

        private write() {
        }

        public /* synthetic */ write(C4381eq eqVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            C4381eq eqVar = C4381eq.this;
            getSupplier MediaBrowserCompat$CustomActionResultReceiver = eqVar.read;
            AutoValue_CrashlyticsReport_Session_Application_Organization MediaBrowserCompat$ItemReceiver = AutoValue_CrashlyticsReport_Session_Application_Organization.MediaBrowserCompat$ItemReceiver();
            if (list != null && !list.isEmpty()) {
                MediaBrowserCompat$ItemReceiver.read = MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(list, "BILLPAYMENT");
                MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(list, "TRANSFER");
                MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(list, "TOPUP");
                MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(list, "REMITTANCE");
            }
            AutoValue_CrashlyticsReport_Session_Application_Organization unused = eqVar.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver;
            C4381eq eqVar2 = C4381eq.this;
            C4363ec ecVar = new C4363ec(this);
            if (eqVar2.RatingCompat != null) {
                ecVar.IconCompatParcelizer(eqVar2.RatingCompat);
            }
        }
    }

    /* renamed from: o.eq$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        long MediaBrowserCompat$ItemReceiver;

        public final /* synthetic */ void onNext(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C4381eq eqVar = C4381eq.this;
                C4358eZ eZVar = new C4358eZ(this);
                if (eqVar.RatingCompat != null) {
                    eZVar.IconCompatParcelizer(eqVar.RatingCompat);
                }
            }
        }

        public IconCompatParcelizer(long j) {
            this.MediaBrowserCompat$ItemReceiver = j;
        }

        public final void onError(Throwable th) {
            C4381eq.this.MediaBrowserCompat$ItemReceiver(C4381eq.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public void onDestroy() {
        if (this.RatingCompat != null) {
            this.RatingCompat.aj_();
        }
        super.onDestroy();
    }
}

package p040o;

import p040o.AppMeasurement;
import p040o.access$2300;

/* renamed from: o.gP */
public class C4458gP extends writeUInt64NoTag<getDocumentSkew$MediaBrowserCompat$CustomActionResultReceiver> {
    public final AppMeasurement.UserProperty write;

    @HmlPinActivity
    public C4458gP(RegularImmutableBiMap regularImmutableBiMap, AppMeasurement.UserProperty userProperty) {
        super(regularImmutableBiMap);
        this.write = userProperty;
    }

    /* renamed from: o.gP$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private read() {
        }

        public /* synthetic */ read(C4458gP gPVar, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            C4458gP.this.MediaBrowserCompat$ItemReceiver(C4458gP.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4458gP gPVar = C4458gP.this;
            C9947gA gAVar = C9947gA.write;
            if (gPVar.RatingCompat != null) {
                gAVar.IconCompatParcelizer(gPVar.RatingCompat);
            }
        }
    }
}

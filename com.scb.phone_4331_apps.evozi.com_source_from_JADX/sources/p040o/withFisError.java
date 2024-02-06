package p040o;

import p040o.access$2300;
import p040o.proxyGetICheckDeserializerRtti;

/* renamed from: o.withFisError */
public class withFisError extends writeUInt64NoTag<proxyGetICheckDeserializerRtti.write> {
    public boolean MediaBrowserCompat$ItemReceiver;
    final containsValueImpl read;
    public final MapStyleOptions write;

    @HmlPinActivity
    public withFisError(RegularImmutableBiMap regularImmutableBiMap, MapStyleOptions mapStyleOptions, containsValueImpl containsvalueimpl) {
        super(regularImmutableBiMap);
        this.write = mapStyleOptions;
        this.read = containsvalueimpl;
    }

    /* renamed from: o.withFisError$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzxl> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(withFisError withfiserror, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzxl zzxl = (zzxl) obj;
            withFisError.IconCompatParcelizer(withFisError.this);
            if (withFisError.this.RatingCompat != null) {
                withFisError.write(withFisError.this, zzxl);
            }
        }

        public final void onError(Throwable th) {
            if ((withFisError.this.RatingCompat != null) && !withFisError.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                withFisError.this.MediaBrowserCompat$ItemReceiver(withFisError.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(withFisError withfiserror) {
        if (withfiserror.RatingCompat != null) {
            withfiserror.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(withFisError withfiserror, zzxl zzxl) {
        boolean z = true;
        if (zzxl.write != null && !zzxl.write.isEmpty()) {
            FirebaseInstallations$$Lambda$5 firebaseInstallations$$Lambda$5 = new FirebaseInstallations$$Lambda$5(withfiserror, zzxl);
            if (withfiserror.RatingCompat == null) {
                z = false;
            }
            if (z) {
                firebaseInstallations$$Lambda$5.IconCompatParcelizer(withfiserror.RatingCompat);
                return;
            }
            return;
        }
        FirebaseInstallations$$Lambda$1 firebaseInstallations$$Lambda$1 = new FirebaseInstallations$$Lambda$1(withfiserror);
        if (withfiserror.RatingCompat == null) {
            z = false;
        }
        if (z) {
            firebaseInstallations$$Lambda$1.IconCompatParcelizer(withfiserror.RatingCompat);
        }
    }
}

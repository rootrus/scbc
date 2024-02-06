package p040o;

import p040o.C$Gson$Types;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;

/* renamed from: o.getOwnerType */
public class getOwnerType extends writeUInt64NoTag<CheckCaptureModule_GetIExtractionServerKtaFactory.write> {
    private logEventNoInterceptor write;

    @HmlPinActivity
    getOwnerType(RegularImmutableBiMap regularImmutableBiMap, logEventNoInterceptor logeventnointerceptor) {
        super(regularImmutableBiMap);
        this.write = logeventnointerceptor;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        boolean z = true;
        if (this.write.MediaBrowserCompat$CustomActionResultReceiver.setShortcut()) {
            C$Gson$Types.WildcardTypeImpl wildcardTypeImpl = C$Gson$Types.WildcardTypeImpl.write;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                wildcardTypeImpl.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        getLowerBounds getlowerbounds = getLowerBounds.IconCompatParcelizer;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getlowerbounds.IconCompatParcelizer(this.RatingCompat);
        }
    }
}

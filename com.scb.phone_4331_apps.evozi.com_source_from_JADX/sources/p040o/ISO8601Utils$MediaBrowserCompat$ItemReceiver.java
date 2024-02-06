package p040o;

import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.TypeAdapters;
import p040o.writeUInt64NoTag;

/* renamed from: o.ISO8601Utils$MediaBrowserCompat$ItemReceiver */
final class ISO8601Utils$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setGeodesic> {
    private /* synthetic */ ISO8601Utils MediaBrowserCompat$CustomActionResultReceiver;

    private ISO8601Utils$MediaBrowserCompat$ItemReceiver(ISO8601Utils iSO8601Utils) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iSO8601Utils;
    }

    /* synthetic */ ISO8601Utils$MediaBrowserCompat$ItemReceiver(ISO8601Utils iSO8601Utils, byte b) {
        this(iSO8601Utils);
    }

    public final /* synthetic */ void onNext(Object obj) {
        setGeodesic setgeodesic = (setGeodesic) obj;
        boolean z = true;
        if (setgeodesic.MediaBrowserCompat$ItemReceiver.size() > 0) {
            required MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$ItemReceiver(setgeodesic);
            ISO8601Utils iSO8601Utils = this.MediaBrowserCompat$CustomActionResultReceiver;
            TypeAdapters.C390535.C39061 r3 = new writeUInt64NoTag.IconCompatParcelizer() {
                public final void IconCompatParcelizer(Object obj) {
                    ((CheckCaptureModule_GetIJsonExactionHelperRttiFactory.IconCompatParcelizer) obj).IconCompatParcelizer(required.this);
                }
            };
            if (iSO8601Utils.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r3.IconCompatParcelizer(iSO8601Utils.RatingCompat);
                return;
            }
            return;
        }
        ISO8601Utils iSO8601Utils2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        TypeAdapters.C39106 r0 = TypeAdapters.C39106.read;
        if (iSO8601Utils2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            r0.IconCompatParcelizer(iSO8601Utils2.RatingCompat);
        }
    }

    public final void onComplete() {
        ISO8601Utils.write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void onError(Throwable th) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            ISO8601Utils.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            ISO8601Utils iSO8601Utils = this.MediaBrowserCompat$CustomActionResultReceiver;
            TypeAdapters.C39117 r0 = TypeAdapters.C39117.MediaBrowserCompat$ItemReceiver;
            if (iSO8601Utils.RatingCompat != null) {
                r0.IconCompatParcelizer(iSO8601Utils.RatingCompat);
            }
        }
    }
}

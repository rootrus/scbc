package p040o;

import p040o.access$2300;
import p040o.proxyGetICheckDeserializerRtti;

/* renamed from: o.getResponseCode */
public class getResponseCode extends writeUInt64NoTag<proxyGetICheckDeserializerRtti.MediaMetadataCompat> {
    public MapStyleOptions MediaBrowserCompat$ItemReceiver;
    public boolean read = false;

    @HmlPinActivity
    public getResponseCode(RegularImmutableBiMap regularImmutableBiMap, MapStyleOptions mapStyleOptions) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = mapStyleOptions;
    }

    /* renamed from: o.getResponseCode$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setTvRemark> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(getResponseCode getresponsecode, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean z = false;
            getResponseCode.this.read = false;
            getResponseCode.MediaBrowserCompat$CustomActionResultReceiver(getResponseCode.this);
            getResponseCode getresponsecode = getResponseCode.this;
            InstallationTokenResult installationTokenResult = new InstallationTokenResult((setTvRemark) obj);
            if (getresponsecode.RatingCompat != null) {
                z = true;
            }
            if (z) {
                installationTokenResult.IconCompatParcelizer(getresponsecode.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            if ((getResponseCode.this.RatingCompat != null) && !getResponseCode.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                getResponseCode getresponsecode = getResponseCode.this;
                getresponsecode.MediaBrowserCompat$ItemReceiver(getresponsecode.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getResponseCode getresponsecode) {
        if (getresponsecode.RatingCompat != null) {
            getresponsecode.RatingCompat.aj_();
        }
    }
}

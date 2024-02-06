package p040o;

import com.google.gson.Gson;
import java.util.HashMap;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRequest$MediaBrowserCompat$SearchResultReceiver */
final class getRequest$MediaBrowserCompat$SearchResultReceiver<T> implements DebitCardMarketConductDeepLinkActivity<zzuk> {
    private /* synthetic */ getRequest MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ HashMap MediaBrowserCompat$ItemReceiver;

    getRequest$MediaBrowserCompat$SearchResultReceiver(getRequest getrequest, HashMap hashMap) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getrequest;
        this.MediaBrowserCompat$ItemReceiver = hashMap;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        final String json = new Gson().toJson((Object) this.MediaBrowserCompat$ItemReceiver);
        getRequest.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        getRequest getrequest = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C6981xf382ab77>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                C6981xf382ab77 passportCaptureModule_PassportOnDeviceExtractionServer_Factory$MediaBrowserCompat$ItemReceiver = (C6981xf382ab77) obj;
                String str = json;
                onGetStartedClick.IconCompatParcelizer((Object) str, "json");
                passportCaptureModule_PassportOnDeviceExtractionServer_Factory$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(str);
                passportCaptureModule_PassportOnDeviceExtractionServer_Factory$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            }
        };
        if (getrequest.RatingCompat != null) {
            r1.IconCompatParcelizer(getrequest.RatingCompat);
        }
    }
}

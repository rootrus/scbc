package p040o;

import java.util.ArrayList;
import p040o.GeoDataClient;

/* renamed from: o.setMessage */
public class setMessage extends writeUInt64NoTag<RttiPassportExtractor> {
    public final SplitInstallException IconCompatParcelizer;

    @HmlPinActivity
    public setMessage(RegularImmutableBiMap regularImmutableBiMap, SplitInstallException splitInstallException) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = splitInstallException;
    }

    public void onDestroy() {
        SplitInstallException splitInstallException = this.IconCompatParcelizer;
        if (!splitInstallException.MediaBrowserCompat$MediaItem.isDisposed()) {
            splitInstallException.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void read(setMessage setmessage) {
        if (setmessage.RatingCompat != null) {
            setmessage.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(setMessage setmessage, GeoDataClient geoDataClient) {
        ArrayList arrayList = new ArrayList();
        for (GeoDataClient.read next : geoDataClient.IconCompatParcelizer) {
            onGetStartedClick.write((Object) next, "domain");
            arrayList.add(new lambda$getSortedCustomAttributes$0(next.write, next.read));
        }
        proxyProvideIISelfieOverlayView proxyprovideiiselfieoverlayview = new proxyProvideIISelfieOverlayView(arrayList);
        if (setmessage.RatingCompat != null) {
            proxyprovideiiselfieoverlayview.IconCompatParcelizer(setmessage.RatingCompat);
        }
    }
}

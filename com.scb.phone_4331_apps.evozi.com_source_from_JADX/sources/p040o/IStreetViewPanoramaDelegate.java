package p040o;

import java.util.ArrayList;

/* renamed from: o.IStreetViewPanoramaDelegate */
public final /* synthetic */ class IStreetViewPanoramaDelegate implements ETBProductDetailDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ LatLngBounds read;

    public /* synthetic */ IStreetViewPanoramaDelegate(LatLngBounds latLngBounds, String str) {
        this.read = latLngBounds;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final Object read(Object obj, Object obj2, Object obj3, Object obj4) {
        LatLngBounds latLngBounds = this.read;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        getStartCap getstartcap = (getStartCap) obj;
        getStartCap getstartcap2 = (getStartCap) obj2;
        getStartCap getstartcap3 = (getStartCap) obj3;
        getStartCap getstartcap4 = (getStartCap) obj4;
        ArrayList arrayList = new ArrayList();
        if (!(getstartcap == null || getstartcap.MediaBrowserCompat$MediaItem == null)) {
            arrayList.add(getstartcap);
        }
        if (!(getstartcap2 == null || getstartcap2.MediaBrowserCompat$MediaItem == null)) {
            arrayList.add(getstartcap2);
        }
        if (!(getstartcap3 == null || getstartcap3.MediaBrowserCompat$MediaItem == null)) {
            arrayList.add(getstartcap3);
        }
        if (!(getstartcap4 == null || getstartcap4.MediaBrowserCompat$MediaItem == null)) {
            arrayList.add(getstartcap4);
        }
        if (!arrayList.isEmpty()) {
            latLngBounds.MediaBrowserCompat$ItemReceiver.write(str, arrayList);
        }
        return arrayList;
    }
}

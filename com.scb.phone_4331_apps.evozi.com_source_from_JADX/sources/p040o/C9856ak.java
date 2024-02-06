package p040o;

import com.scb.phone.view.activity.deeplink.ScanCameraDeepLinkActivity;
import java.util.NoSuchElementException;
import p040o.SortedMaps;
import p040o.writeUInt64NoTag;

/* renamed from: o.ak */
public final /* synthetic */ class C9856ak implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ isSupportFragmentClass IconCompatParcelizer;
    private final /* synthetic */ addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ C9856ak(addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver addbarcodefoundeventlistener_mediabrowsercompat_itemreceiver, isSupportFragmentClass issupportfragmentclass) {
        this.read = addbarcodefoundeventlistener_mediabrowsercompat_itemreceiver;
        this.IconCompatParcelizer = issupportfragmentclass;
    }

    /* renamed from: o.ak$a */
    public final class C7098a implements MileageQuantitySelectionActivity<ScanCameraDeepLinkActivity> {
        public static void MediaBrowserCompat$ItemReceiver(ScanCameraDeepLinkActivity scanCameraDeepLinkActivity, getIdType getidtype) {
            scanCameraDeepLinkActivity.iDeviceCompatibilityHelper = getidtype;
        }

        public static void IconCompatParcelizer(ScanCameraDeepLinkActivity scanCameraDeepLinkActivity, DetectedDocumentBoundary detectedDocumentBoundary) {
            scanCameraDeepLinkActivity.presenter = detectedDocumentBoundary;
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver addbarcodefoundeventlistener_mediabrowsercompat_itemreceiver = this.read;
        isSupportFragmentClass issupportfragmentclass = this.IconCompatParcelizer;
        getCheckUsabilityData$MediaBrowserCompat$ItemReceiver getcheckusabilitydata_mediabrowsercompat_itemreceiver = (getCheckUsabilityData$MediaBrowserCompat$ItemReceiver) obj;
        SortedMaps.C38043 unused = addbarcodefoundeventlistener_mediabrowsercompat_itemreceiver.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            getcheckusabilitydata_mediabrowsercompat_itemreceiver.write(SortedMaps.C38043.MediaBrowserCompat$ItemReceiver((setAlwaysShow) t));
            return;
        }
        throw new NoSuchElementException("No value present");
    }
}

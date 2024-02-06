package p040o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.getLayers;

/* renamed from: o.notifyCompletion */
public class notifyCompletion extends FragmentBuilder_BindSummaryFragment {
    public final getDeviceMetaData MediaBrowserCompat$CustomActionResultReceiver = new getDeviceMetaData();

    public final zzsj MediaBrowserCompat$ItemReceiver(incrementMatteOrMaskCount incrementmatteormaskcount) {
        List list;
        double d;
        List list2;
        boolean z;
        if (incrementmatteormaskcount == null || incrementmatteormaskcount.MediaBrowserCompat$CustomActionResultReceiver == null) {
            list = new ArrayList();
        } else {
            list = incrementmatteormaskcount.MediaBrowserCompat$CustomActionResultReceiver;
        }
        Collections.sort(list);
        zzsj MediaBrowserCompat$ItemReceiver = zzsj.MediaBrowserCompat$ItemReceiver();
        if (incrementmatteormaskcount == null || incrementmatteormaskcount.write == null) {
            d = 0.0d;
        } else {
            d = incrementmatteormaskcount.write.doubleValue();
        }
        MediaBrowserCompat$ItemReceiver.write = Double.valueOf(d);
        getDeviceMetaData getdevicemetadata = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (incrementmatteormaskcount == null || incrementmatteormaskcount.MediaBrowserCompat$ItemReceiver == null) {
            list2 = new ArrayList();
        } else {
            list2 = incrementmatteormaskcount.MediaBrowserCompat$ItemReceiver;
        }
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = getdevicemetadata.MediaBrowserCompat$ItemReceiver(list2);
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = getLayers.IconCompatParcelizer.write(list);
        if (incrementmatteormaskcount != null) {
            z = DiskLruCache.VERSION_1.equals(incrementmatteormaskcount.IconCompatParcelizer);
        } else {
            z = false;
        }
        MediaBrowserCompat$ItemReceiver.read = z;
        return MediaBrowserCompat$ItemReceiver;
    }
}

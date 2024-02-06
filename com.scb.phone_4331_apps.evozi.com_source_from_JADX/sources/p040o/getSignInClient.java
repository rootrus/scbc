package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.Geofence;

/* renamed from: o.getSignInClient */
public class getSignInClient extends FragmentBuilder_BindSummaryFragment {
    private static Geofence.Builder MediaBrowserCompat$ItemReceiver(getFillType getfilltype) {
        String str = getfilltype.write;
        Iterable<getGradientColor> iterable = getfilltype.read;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getGradientColor getgradientcolor : iterable) {
            onGetStartedClick.write((Object) getgradientcolor, "entity");
            arrayList.add(new ActivityTransitionRequest(getgradientcolor.read, getgradientcolor.MediaBrowserCompat$CustomActionResultReceiver));
        }
        return new Geofence.Builder(str, (List) arrayList);
    }

    /* access modifiers changed from: protected */
    public final FusedLocationProviderClient IconCompatParcelizer(getEndPoint getendpoint) {
        onGetStartedClick.write((Object) getendpoint, "entity");
        boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getendpoint.IconCompatParcelizer, (Object) DiskLruCache.VERSION_1);
        String str = getendpoint.MediaBrowserCompat$CustomActionResultReceiver;
        Iterable<getFillType> iterable = getendpoint.read;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getFillType MediaBrowserCompat$ItemReceiver2 : iterable) {
            arrayList.add(MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2));
        }
        return new FusedLocationProviderClient(MediaBrowserCompat$ItemReceiver, str, (List) arrayList);
    }

    public static Geofence read(lerp lerp) {
        List list;
        onGetStartedClick.write((Object) lerp, "entity");
        boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) lerp.write, (Object) DiskLruCache.VERSION_1);
        String str = lerp.MediaBrowserCompat$CustomActionResultReceiver;
        List<getGradientColor> list2 = lerp.read;
        if (list2 != null) {
            Iterable<getGradientColor> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (getGradientColor getgradientcolor : iterable) {
                onGetStartedClick.write((Object) getgradientcolor, "entity");
                arrayList.add(new ActivityTransitionRequest(getgradientcolor.read, getgradientcolor.MediaBrowserCompat$CustomActionResultReceiver));
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        return new Geofence(MediaBrowserCompat$ItemReceiver, str, list);
    }
}

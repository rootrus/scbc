package p040o;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.Comparator;

/* renamed from: o.getImageAssetManager$MediaBrowserCompat$ItemReceiver */
public final class getImageAssetManager$MediaBrowserCompat$ItemReceiver<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) t;
        onGetStartedClick.IconCompatParcelizer((Object) setdatacollectionenabled, ProductAction.ACTION_DETAIL);
        Comparable valueOf = Integer.valueOf(setdatacollectionenabled.MediaBrowserCompat$CustomActionResultReceiver);
        setDataCollectionEnabled setdatacollectionenabled2 = (setDataCollectionEnabled) t2;
        onGetStartedClick.IconCompatParcelizer((Object) setdatacollectionenabled2, ProductAction.ACTION_DETAIL);
        Comparable valueOf2 = Integer.valueOf(setdatacollectionenabled2.MediaBrowserCompat$CustomActionResultReceiver);
        if (valueOf == valueOf2) {
            return 0;
        }
        if (valueOf == null) {
            return -1;
        }
        if (valueOf2 == null) {
            return 1;
        }
        return valueOf.compareTo(valueOf2);
    }
}

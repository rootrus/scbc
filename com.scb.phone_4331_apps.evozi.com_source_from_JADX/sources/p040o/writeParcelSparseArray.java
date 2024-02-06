package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zzcb;

/* renamed from: o.writeParcelSparseArray */
public final /* synthetic */ class writeParcelSparseArray implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ writeParcelSparseArray MediaBrowserCompat$CustomActionResultReceiver = new writeParcelSparseArray();

    private /* synthetic */ writeParcelSparseArray() {
    }

    public final Object write(Object obj) {
        List list;
        getOpacity getopacity = (getOpacity) ((SingleDataEntity) obj).getData();
        String str = getopacity.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = getopacity.write;
        String str3 = getopacity.MediaBrowserCompat$ItemReceiver;
        List<getImageAssetManager> list2 = getopacity.IconCompatParcelizer;
        if (list2 != null) {
            Iterable<getImageAssetManager> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (getImageAssetManager read : iterable) {
                arrayList.add(read.read());
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        return new zzcb.zzf.zza(str, str2, str3, list);
    }
}

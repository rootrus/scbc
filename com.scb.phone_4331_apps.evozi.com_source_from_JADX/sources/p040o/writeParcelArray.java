package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.writeParcelArray */
public final /* synthetic */ class writeParcelArray implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ writeParcelArray IconCompatParcelizer = new writeParcelArray();

    private /* synthetic */ writeParcelArray() {
    }

    public final Object write(Object obj) {
        getIntrinsicHeight getintrinsicheight = (getIntrinsicHeight) ((SingleDataEntity) obj).getData();
        String str = getintrinsicheight.read;
        String str2 = getintrinsicheight.MediaBrowserCompat$ItemReceiver;
        Iterable<getMaxScale> iterable = getintrinsicheight.IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getMaxScale IconCompatParcelizer2 : iterable) {
            arrayList.add(IconCompatParcelizer2.IconCompatParcelizer());
        }
        return new C6959xc24751b1(str, str2, (List) arrayList);
    }
}

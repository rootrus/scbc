package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zzjx;

/* renamed from: o.zzhe */
public final /* synthetic */ class zzhe implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzjv write;

    public /* synthetic */ zzhe(zzjv zzjv) {
        this.write = zzjv;
    }

    public final Object write(Object obj) {
        List list = (List) obj;
        onGetStartedClick.write((Object) list, "entities");
        Iterable<setVertex> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (setVertex setvertex : iterable) {
            onGetStartedClick.write((Object) setvertex, "entity");
            arrayList.add(new zzjx.zzc(setvertex.MediaBrowserCompat$ItemReceiver, setvertex.MediaBrowserCompat$CustomActionResultReceiver));
        }
        return (List) arrayList;
    }
}

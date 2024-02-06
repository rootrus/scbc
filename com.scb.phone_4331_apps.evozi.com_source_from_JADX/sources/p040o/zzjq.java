package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zzjx;

/* renamed from: o.zzjq */
public final /* synthetic */ class zzjq implements DirectDebitDeepLinkActivity {
    public /* synthetic */ zzjq(closeTutorial closetutorial) {
    }

    public final Object write(Object obj) {
        getFamily getfamily = (getFamily) obj;
        onGetStartedClick.write((Object) getfamily, "hmlSetupAccountsList");
        Iterable<getEnd> iterable = getfamily.write;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getEnd getend : iterable) {
            arrayList.add(new zzjx.zze.zzc(getend.IconCompatParcelizer, getend.MediaBrowserCompat$ItemReceiver, getend.read));
        }
        return (List) arrayList;
    }
}

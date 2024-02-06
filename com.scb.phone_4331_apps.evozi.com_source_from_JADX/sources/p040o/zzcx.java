package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.Action;

/* renamed from: o.zzcx */
public final /* synthetic */ class zzcx implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzcx MediaBrowserCompat$CustomActionResultReceiver = new zzcx();

    private /* synthetic */ zzcx() {
    }

    public final Object write(Object obj) {
        Action action = (Action) obj;
        Iterable<verifyDrawable> write = HmlNTBBusinessURLInformationActivity.write(action.read, new Action.IconCompatParcelizer());
        onGetStartedClick.write((Object) write, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(write instanceof Collection ? ((Collection) write).size() : 10);
        for (verifyDrawable write2 : write) {
            arrayList.add(write2.write());
        }
        return new zzwc((List) arrayList, action.IconCompatParcelizer);
    }
}

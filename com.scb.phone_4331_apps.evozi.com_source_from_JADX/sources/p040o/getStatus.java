package p040o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.getStatus */
public final class getStatus extends FragmentBuilder_BindSummaryFragment {
    public static List<getInterval> MediaBrowserCompat$ItemReceiver(getPoints getpoints) {
        ArrayList arrayList = new ArrayList();
        for (getPoints$MediaBrowserCompat$ItemReceiver next : getpoints.write) {
            arrayList.add(new getInterval(next.MediaBrowserCompat$CustomActionResultReceiver, next.MediaBrowserCompat$ItemReceiver, next.read));
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}

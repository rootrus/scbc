package p040o;

import java.util.Comparator;
import p040o.C4128bz;

/* renamed from: o.getPictureFormat */
public final /* synthetic */ class getPictureFormat implements Comparator {
    private final /* synthetic */ C4128bz.write write;

    public /* synthetic */ getPictureFormat(C4128bz.write write2) {
        this.write = write2;
    }

    public final int compare(Object obj, Object obj2) {
        return C4128bz.write.MediaBrowserCompat$ItemReceiver((setOrgId) obj, (setOrgId) obj2);
    }
}

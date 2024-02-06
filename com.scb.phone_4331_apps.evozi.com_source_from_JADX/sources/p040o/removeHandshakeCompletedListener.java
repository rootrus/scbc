package p040o;

import java.util.Comparator;

/* renamed from: o.removeHandshakeCompletedListener */
public final class removeHandshakeCompletedListener implements Comparator<getSoTimeout<?>> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        getSoTimeout getsotimeout = (getSoTimeout) obj;
        getSoTimeout getsotimeout2 = (getSoTimeout) obj2;
        if (getsotimeout == null || getsotimeout2 == null) {
            return 0;
        }
        if (getsotimeout.MediaBrowserCompat$ItemReceiver.compareTo(getsotimeout2.MediaBrowserCompat$ItemReceiver) > 0) {
            return 1;
        }
        if (getsotimeout.MediaBrowserCompat$ItemReceiver.compareTo(getsotimeout2.MediaBrowserCompat$ItemReceiver) < 0) {
            return -1;
        }
        return 0;
    }
}

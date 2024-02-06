package p040o;

import java.util.Map;

/* renamed from: o.deleteDirectory */
public final /* synthetic */ class deleteDirectory implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ deleteDirectory(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final boolean write(Object obj) {
        return ((String) ((Map.Entry) obj).getValue()).equalsIgnoreCase(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

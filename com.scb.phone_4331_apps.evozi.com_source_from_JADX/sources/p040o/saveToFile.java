package p040o;

import java.util.List;

/* renamed from: o.saveToFile */
public final /* synthetic */ class saveToFile implements dump {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ saveToFile(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.add((getTile) obj);
    }
}

package p040o;

import java.io.IOException;
import java.util.Calendar;
import p040o.onTransferOutClick;

/* renamed from: o.onTransferOutClick$MediaSessionCompat$QueueItem */
class onTransferOutClick$MediaSessionCompat$QueueItem implements onTransferOutClick.IconCompatParcelizer {
    private final onTransferOutClick.IconCompatParcelizer read;

    onTransferOutClick$MediaSessionCompat$QueueItem(onTransferOutClick.IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final int read() {
        return this.read.read();
    }

    public final void read(Appendable appendable, Calendar calendar) throws IOException {
        int i = calendar.get(10);
        if (i == 0) {
            i = calendar.getLeastMaximum(10) + 1;
        }
        this.read.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
    }
}

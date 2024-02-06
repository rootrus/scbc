package p040o;

import java.io.IOException;
import java.util.Calendar;

/* renamed from: o.onTransferOutClick$MediaSessionCompat$ResultReceiverWrapper */
class onTransferOutClick$MediaSessionCompat$ResultReceiverWrapper implements onTransferOutClick$MediaBrowserCompat$SearchResultReceiver {
    static final onTransferOutClick$MediaSessionCompat$ResultReceiverWrapper MediaBrowserCompat$CustomActionResultReceiver = new onTransferOutClick$MediaSessionCompat$ResultReceiverWrapper(false);
    static final onTransferOutClick$MediaSessionCompat$ResultReceiverWrapper MediaBrowserCompat$ItemReceiver = new onTransferOutClick$MediaSessionCompat$ResultReceiverWrapper(true);
    private boolean read;

    public final int read() {
        return 5;
    }

    private onTransferOutClick$MediaSessionCompat$ResultReceiverWrapper(boolean z) {
        this.read = z;
    }

    public final void read(Appendable appendable, Calendar calendar) throws IOException {
        int i = calendar.get(15) + calendar.get(16);
        if (i < 0) {
            appendable.append('-');
            i = -i;
        } else {
            appendable.append('+');
        }
        int i2 = i / 3600000;
        onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, i2);
        if (this.read) {
            appendable.append(':');
        }
        onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, (i / 60000) - (i2 * 60));
    }
}

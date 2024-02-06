package p040o;

import java.io.IOException;
import java.util.Calendar;

/* renamed from: o.onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver */
class onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver implements onTransferOutClick$MediaBrowserCompat$SearchResultReceiver {
    private static onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer = new onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver(5);
    static final onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = new onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver(6);
    private static onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver read = new onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver(3);
    private int write;

    static onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver(int i) {
        if (i == 1) {
            return read;
        }
        if (i == 2) {
            return IconCompatParcelizer;
        }
        if (i == 3) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new IllegalArgumentException("invalid number of X");
    }

    private onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.write = i;
    }

    public final int read() {
        return this.write;
    }

    public final void read(Appendable appendable, Calendar calendar) throws IOException {
        int i = calendar.get(15) + calendar.get(16);
        if (i == 0) {
            appendable.append("Z");
            return;
        }
        if (i < 0) {
            appendable.append('-');
            i = -i;
        } else {
            appendable.append('+');
        }
        int i2 = i / 3600000;
        onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, i2);
        int i3 = this.write;
        if (i3 >= 5) {
            if (i3 == 6) {
                appendable.append(':');
            }
            onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, (i / 60000) - (i2 * 60));
        }
    }
}

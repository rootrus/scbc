package p040o;

import java.io.IOException;
import java.util.Calendar;
import p040o.onTransferOutClick;

/* renamed from: o.onTransferOutClick$MediaBrowserCompat$ItemReceiver */
class onTransferOutClick$MediaBrowserCompat$ItemReceiver implements onTransferOutClick.IconCompatParcelizer {
    private final int read;
    private final int write;

    onTransferOutClick$MediaBrowserCompat$ItemReceiver(int i, int i2) {
        if (i2 >= 3) {
            this.read = i;
            this.write = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final int read() {
        return this.write;
    }

    public final void read(Appendable appendable, Calendar calendar) throws IOException {
        onTransferOutClick.write(appendable, calendar.get(this.read), this.write);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException {
        onTransferOutClick.write(appendable, i, this.write);
    }
}

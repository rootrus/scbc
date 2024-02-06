package p040o;

import java.io.IOException;
import java.util.Calendar;
import p040o.onTransferOutClick;

/* renamed from: o.onTransferOutClick$MediaSessionCompat$Token */
class onTransferOutClick$MediaSessionCompat$Token implements onTransferOutClick.IconCompatParcelizer {
    static final onTransferOutClick$MediaSessionCompat$Token MediaBrowserCompat$ItemReceiver = new onTransferOutClick$MediaSessionCompat$Token();

    public final int read() {
        return 2;
    }

    onTransferOutClick$MediaSessionCompat$Token() {
    }

    public final void read(Appendable appendable, Calendar calendar) throws IOException {
        onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, calendar.get(2) + 1);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException {
        onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
    }
}

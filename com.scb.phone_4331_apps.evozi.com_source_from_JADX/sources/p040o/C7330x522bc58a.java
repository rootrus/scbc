package p040o;

import java.io.IOException;
import java.util.Calendar;
import p040o.onTransferOutClick;

/* renamed from: o.onTransferOutClick$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
class C7330x522bc58a implements onTransferOutClick.IconCompatParcelizer {
    private final onTransferOutClick.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    C7330x522bc58a(onTransferOutClick.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final int read() {
        return this.MediaBrowserCompat$ItemReceiver.read();
    }

    public final void read(Appendable appendable, Calendar calendar) throws IOException {
        int i = calendar.get(11);
        if (i == 0) {
            i = calendar.getMaximum(11) + 1;
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
    }
}

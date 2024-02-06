package p040o;

import java.io.IOException;
import java.util.Calendar;
import p040o.onTransferOutClick;

/* renamed from: o.onTransferOutClick$AlertController$RecycleListView */
class onTransferOutClick$AlertController$RecycleListView implements onTransferOutClick.IconCompatParcelizer {
    static final onTransferOutClick$AlertController$RecycleListView write = new onTransferOutClick$AlertController$RecycleListView();

    public final int read() {
        return 2;
    }

    onTransferOutClick$AlertController$RecycleListView() {
    }

    public final void read(Appendable appendable, Calendar calendar) throws IOException {
        onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, calendar.get(1) % 100);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException {
        onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
    }
}

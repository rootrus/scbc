package p040o;

import p040o.getChannels;
import p040o.writeUInt64NoTag;

/* renamed from: o.getChannels$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver */
final class C4515xb50fc22d implements Runnable {
    private /* synthetic */ getChannels.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    C4515xb50fc22d(getChannels.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public final void run() {
        getChannels getchannels = getChannels.this;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C45163.write;
        if (getchannels.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getchannels.RatingCompat);
        }
    }
}

package p040o;

import p040o.getEventLogSize;

/* renamed from: o.finalizeReports */
public final /* synthetic */ class finalizeReports implements Runnable {
    private final /* synthetic */ getEventLogSize.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ finalizeReports(getEventLogSize.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void run() {
        getEventLogSize.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        getEventLogSize geteventlogsize = getEventLogSize.this;
        geteventlogsize.write(geteventlogsize.IconCompatParcelizer, getEventLogSize.this.MediaBrowserCompat$ItemReceiver, getEventLogSize.this.read, getEventLogSize.this.write);
    }
}

package p040o;

import p040o.getEventLogSize;

/* renamed from: o.writeTextFile */
public final /* synthetic */ class writeTextFile implements Runnable {
    private final /* synthetic */ getEventLogSize.write MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ writeTextFile(getEventLogSize.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final void run() {
        getEventLogSize.write write = this.MediaBrowserCompat$CustomActionResultReceiver;
        getEventLogSize geteventlogsize = getEventLogSize.this;
        geteventlogsize.read(geteventlogsize.IconCompatParcelizer, getEventLogSize.this.MediaBrowserCompat$ItemReceiver, getEventLogSize.this.read, getEventLogSize.this.write);
    }
}

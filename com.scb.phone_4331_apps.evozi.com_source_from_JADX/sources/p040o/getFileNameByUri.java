package p040o;

import p040o.setDomain;

/* renamed from: o.getFileNameByUri */
public final /* synthetic */ class getFileNameByUri implements Runnable {
    private final /* synthetic */ setDomain.write MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getFileNameByUri(setDomain.write write) {
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final void run() {
        setDomain.write write = this.MediaBrowserCompat$ItemReceiver;
        setDomain setdomain = setDomain.this;
        getDocumentPath getdocumentpath = new getDocumentPath(write);
        if (setdomain.RatingCompat != null) {
            getdocumentpath.IconCompatParcelizer(setdomain.RatingCompat);
        }
    }
}

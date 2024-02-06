package p040o;

import p040o.C5055nb;

/* renamed from: o.qc */
public final /* synthetic */ class C10113qc implements Runnable {
    private final /* synthetic */ C5055nb.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C10113qc(C5055nb.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void run() {
        C5055nb nbVar = C5055nb.this;
        BufferedQuickMrzExtractor bufferedQuickMrzExtractor = BufferedQuickMrzExtractor.IconCompatParcelizer;
        if (nbVar.RatingCompat != null) {
            bufferedQuickMrzExtractor.IconCompatParcelizer(nbVar.RatingCompat);
        }
    }
}

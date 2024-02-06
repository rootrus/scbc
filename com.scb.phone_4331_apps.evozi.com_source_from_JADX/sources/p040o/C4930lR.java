package p040o;

/* renamed from: o.lR */
public final /* synthetic */ class C4930lR implements Runnable {
    private final /* synthetic */ buildNameMap read;

    public /* synthetic */ C4930lR(buildNameMap buildnamemap) {
        this.read = buildnamemap;
    }

    public final void run() {
        buildNameMap buildnamemap = this.read;
        C4979mt mtVar = C4979mt.MediaBrowserCompat$CustomActionResultReceiver;
        if (buildnamemap.RatingCompat != null) {
            mtVar.IconCompatParcelizer(buildnamemap.RatingCompat);
        }
    }
}

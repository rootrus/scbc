package p040o;

/* renamed from: o.lQ */
public final /* synthetic */ class C4929lQ implements Runnable {
    private final /* synthetic */ buildNameMap write;

    public /* synthetic */ C4929lQ(buildNameMap buildnamemap) {
        this.write = buildnamemap;
    }

    public final void run() {
        buildNameMap buildnamemap = this.write;
        C4932lT lTVar = new C4932lT(buildnamemap);
        if (buildnamemap.RatingCompat != null) {
            lTVar.IconCompatParcelizer(buildnamemap.RatingCompat);
        }
    }
}

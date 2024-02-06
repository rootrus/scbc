package p040o;

/* renamed from: o.deleteFinalizedReport */
public final /* synthetic */ class deleteFinalizedReport implements Runnable {
    private final /* synthetic */ getEventLogSize write;

    public /* synthetic */ deleteFinalizedReport(getEventLogSize geteventlogsize) {
        this.write = geteventlogsize;
    }

    public final void run() {
        getEventLogSize geteventlogsize = this.write;
        encodeZigZag32 encodezigzag32 = encodeZigZag32.MediaBrowserCompat$CustomActionResultReceiver;
        if (geteventlogsize.RatingCompat != null) {
            encodezigzag32.IconCompatParcelizer(geteventlogsize.RatingCompat);
        }
    }
}

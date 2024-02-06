package p040o;

/* renamed from: o.GPUStrategyCombinedEdgeDetection_Factory */
public final /* synthetic */ class GPUStrategyCombinedEdgeDetection_Factory implements Runnable {
    private final /* synthetic */ getSecondPassProgram read;

    public /* synthetic */ GPUStrategyCombinedEdgeDetection_Factory(getSecondPassProgram getsecondpassprogram) {
        this.read = getsecondpassprogram;
    }

    public final void run() {
        getSecondPassProgram getsecondpassprogram = this.read;
        C9794P p = C9794P.MediaBrowserCompat$ItemReceiver;
        if (getsecondpassprogram.RatingCompat != null) {
            p.IconCompatParcelizer(getsecondpassprogram.RatingCompat);
        }
    }
}

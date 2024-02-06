package p040o;

/* renamed from: o.GPUImageNativeLibrary */
public final /* synthetic */ class GPUImageNativeLibrary implements Runnable {
    private final /* synthetic */ getSecondPassProgram MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ GPUImageNativeLibrary(getSecondPassProgram getsecondpassprogram) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getsecondpassprogram;
    }

    public final void run() {
        getSecondPassProgram getsecondpassprogram = this.MediaBrowserCompat$CustomActionResultReceiver;
        C9787N n = C9787N.IconCompatParcelizer;
        if (getsecondpassprogram.RatingCompat != null) {
            n.IconCompatParcelizer(getsecondpassprogram.RatingCompat);
        }
    }
}

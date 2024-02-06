package p040o;

/* renamed from: o.GPUSettings */
public final /* synthetic */ class GPUSettings implements Runnable {
    private final /* synthetic */ getFirstPassTexelWidthUniform$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ GPUSettings(getFirstPassTexelWidthUniform$MediaBrowserCompat$ItemReceiver getfirstpasstexelwidthuniform_mediabrowsercompat_itemreceiver) {
        this.write = getfirstpasstexelwidthuniform_mediabrowsercompat_itemreceiver;
    }

    public final void run() {
        getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform = this.write.read;
        C9779M m = C9779M.write;
        if (getfirstpasstexelwidthuniform.RatingCompat != null) {
            m.IconCompatParcelizer(getfirstpasstexelwidthuniform.RatingCompat);
        }
    }
}

package p040o;

import p040o.INativeGuidance;

/* renamed from: o.readBarcodes */
public final /* synthetic */ class readBarcodes implements Runnable {
    private final /* synthetic */ INativeGuidance.IconCompatParcelizer read;

    public /* synthetic */ readBarcodes(INativeGuidance.IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final void run() {
        INativeGuidance iNativeGuidance = INativeGuidance.this;
        proxyGetIGPUImageHolder proxygetigpuimageholder = proxyGetIGPUImageHolder.MediaBrowserCompat$ItemReceiver;
        if (iNativeGuidance.RatingCompat != null) {
            proxygetigpuimageholder.IconCompatParcelizer(iNativeGuidance.RatingCompat);
        }
    }
}

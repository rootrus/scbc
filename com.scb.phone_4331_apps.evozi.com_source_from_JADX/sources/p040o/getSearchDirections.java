package p040o;

import p040o.INativeGuidance;

/* renamed from: o.getSearchDirections */
public final /* synthetic */ class getSearchDirections implements Runnable {
    private final /* synthetic */ INativeGuidance.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getSearchDirections(INativeGuidance.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public final void run() {
        INativeGuidance iNativeGuidance = INativeGuidance.this;
        proxyGetIGPUImageHolder proxygetigpuimageholder = proxyGetIGPUImageHolder.MediaBrowserCompat$ItemReceiver;
        if (iNativeGuidance.RatingCompat != null) {
            proxygetigpuimageholder.IconCompatParcelizer(iNativeGuidance.RatingCompat);
        }
    }
}

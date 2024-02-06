package p040o;

/* renamed from: o.nScriptIntrinsicBLAS_Complex */
public final class nScriptIntrinsicBLAS_Complex extends nScriptGroup2Execute {
    private final /* synthetic */ nScriptGroupSetInput IconCompatParcelizer;

    public nScriptIntrinsicBLAS_Complex(nScriptGroupSetInput nscriptgroupsetinput) {
        this.IconCompatParcelizer = nscriptgroupsetinput;
    }

    public final void write() {
        if (this.IconCompatParcelizer.MediaSessionCompat$Token != null) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("Unbind from service.", new Object[0]);
            this.IconCompatParcelizer.read.unbindService(this.IconCompatParcelizer.MediaMetadataCompat);
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = false;
            this.IconCompatParcelizer.MediaSessionCompat$Token = null;
            this.IconCompatParcelizer.MediaMetadataCompat = null;
        }
    }
}

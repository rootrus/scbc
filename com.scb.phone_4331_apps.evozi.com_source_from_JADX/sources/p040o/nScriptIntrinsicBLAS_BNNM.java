package p040o;

import p040o.ScriptIntrinsicConvolve5x5;

/* renamed from: o.nScriptIntrinsicBLAS_BNNM */
public final class nScriptIntrinsicBLAS_BNNM extends nScriptGroup2Execute {
    private final /* synthetic */ ScriptIntrinsicConvolve5x5.write IconCompatParcelizer;

    public nScriptIntrinsicBLAS_BNNM(ScriptIntrinsicConvolve5x5.write write) {
        this.IconCompatParcelizer = write;
    }

    public final void write() {
        nScriptGroupSetInput nscriptgroupsetinput = this.IconCompatParcelizer.read;
        nscriptgroupsetinput.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("unlinkToDeath", new Object[0]);
        nscriptgroupsetinput.MediaSessionCompat$Token.asBinder().unlinkToDeath(nscriptgroupsetinput.MediaBrowserCompat$SearchResultReceiver, 0);
        this.IconCompatParcelizer.read.MediaSessionCompat$Token = null;
        this.IconCompatParcelizer.read.MediaBrowserCompat$ItemReceiver = false;
    }
}

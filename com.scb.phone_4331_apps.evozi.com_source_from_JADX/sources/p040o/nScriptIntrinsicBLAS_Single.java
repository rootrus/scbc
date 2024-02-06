package p040o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p040o.ScriptIntrinsicConvolve5x5;

/* renamed from: o.nScriptIntrinsicBLAS_Single */
public final class nScriptIntrinsicBLAS_Single extends nScriptGroup2Execute {
    private final /* synthetic */ IBinder MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ ScriptIntrinsicConvolve5x5.write read;

    public nScriptIntrinsicBLAS_Single(ScriptIntrinsicConvolve5x5.write write, IBinder iBinder) {
        this.read = write;
        this.MediaBrowserCompat$ItemReceiver = iBinder;
    }

    public final void write() {
        this.read.read.MediaSessionCompat$Token = (IInterface) this.read.read.RatingCompat.write(this.MediaBrowserCompat$ItemReceiver);
        nScriptGroupSetInput nscriptgroupsetinput = this.read.read;
        nscriptgroupsetinput.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("linkToDeath", new Object[0]);
        try {
            nscriptgroupsetinput.MediaSessionCompat$Token.asBinder().linkToDeath(nscriptgroupsetinput.MediaBrowserCompat$SearchResultReceiver, 0);
        } catch (RemoteException e) {
            FragmentBuilder_BindPdfViewerFragment fragmentBuilder_BindPdfViewerFragment = nscriptgroupsetinput.MediaBrowserCompat$CustomActionResultReceiver;
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", FragmentBuilder_BindPdfViewerFragment.read(fragmentBuilder_BindPdfViewerFragment.MediaBrowserCompat$CustomActionResultReceiver, "linkToDeath failed", objArr), e);
            }
        }
        this.read.read.MediaBrowserCompat$ItemReceiver = false;
        for (nScriptGroup2Execute run : this.read.read.write) {
            run.run();
        }
        this.read.read.write.clear();
    }
}

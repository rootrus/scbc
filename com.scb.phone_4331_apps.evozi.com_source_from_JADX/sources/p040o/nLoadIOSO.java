package p040o;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: o.nLoadIOSO */
class nLoadIOSO<T> extends nScriptGroupExecute {
    private final FragmentBuilder_BindPdfViewerFragment MediaBrowserCompat$CustomActionResultReceiver;
    final nScriptSetTimeZone<T> MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ FragmentBuilder_BindPersonalLimitFragment read;

    nLoadIOSO(FragmentBuilder_BindPersonalLimitFragment fragmentBuilder_BindPersonalLimitFragment, FragmentBuilder_BindPdfViewerFragment fragmentBuilder_BindPdfViewerFragment, nScriptSetTimeZone<T> nscriptsettimezone) {
        this.read = fragmentBuilder_BindPersonalLimitFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindPdfViewerFragment;
        this.MediaBrowserCompat$ItemReceiver = nscriptsettimezone;
    }

    public void read(Bundle bundle) throws RemoteException {
        nScriptGroupSetInput<nScriptCCreate> nscriptgroupsetinput = this.read.write;
        nscriptgroupsetinput.IconCompatParcelizer().post(new nScriptIntrinsicBLAS_Complex(nscriptgroupsetinput));
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("onCompleteUpdate", new Object[0]);
    }

    public void write(Bundle bundle) throws RemoteException {
        nScriptGroupSetInput<nScriptCCreate> nscriptgroupsetinput = this.read.write;
        nscriptgroupsetinput.IconCompatParcelizer().post(new nScriptIntrinsicBLAS_Complex(nscriptgroupsetinput));
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("onRequestInfo", new Object[0]);
    }
}

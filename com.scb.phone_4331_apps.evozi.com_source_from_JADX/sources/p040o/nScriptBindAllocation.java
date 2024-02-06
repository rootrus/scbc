package p040o;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: o.nScriptBindAllocation */
public final class nScriptBindAllocation extends nScriptGroup2Execute {
    private final /* synthetic */ nScriptSetTimeZone IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ FragmentBuilder_BindPersonalLimitFragment write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nScriptBindAllocation(FragmentBuilder_BindPersonalLimitFragment fragmentBuilder_BindPersonalLimitFragment, nScriptSetTimeZone nscriptsettimezone, nScriptSetTimeZone nscriptsettimezone2, String str) {
        super(nscriptsettimezone);
        this.write = fragmentBuilder_BindPersonalLimitFragment;
        this.IconCompatParcelizer = nscriptsettimezone2;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void write() {
        try {
            String str = this.write.MediaBrowserCompat$ItemReceiver;
            Bundle bundle = new Bundle();
            bundle.putInt("playcore.version.code", 10603);
            ((nScriptCCreate) this.write.write.MediaSessionCompat$Token).MediaBrowserCompat$CustomActionResultReceiver(str, bundle, new nSamplerCreate(this.write, this.IconCompatParcelizer));
        } catch (RemoteException e) {
            FragmentBuilder_BindPdfViewerFragment fragmentBuilder_BindPdfViewerFragment = FragmentBuilder_BindPersonalLimitFragment.IconCompatParcelizer;
            Object[] objArr = {this.MediaBrowserCompat$ItemReceiver};
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", FragmentBuilder_BindPdfViewerFragment.read(fragmentBuilder_BindPdfViewerFragment.MediaBrowserCompat$CustomActionResultReceiver, "completeUpdate(%s)", objArr), e);
            }
            nScriptSetTimeZone nscriptsettimezone = this.IconCompatParcelizer;
            nscriptsettimezone.MediaBrowserCompat$ItemReceiver.write(new RuntimeException(e));
        }
    }
}

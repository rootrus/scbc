package p040o;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: o.nObjDestroy */
public final class nObjDestroy extends nScriptGroup2Execute {
    private final /* synthetic */ nScriptSetTimeZone MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ FragmentBuilder_BindPersonalLimitFragment read;
    private final /* synthetic */ String write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nObjDestroy(FragmentBuilder_BindPersonalLimitFragment fragmentBuilder_BindPersonalLimitFragment, nScriptSetTimeZone nscriptsettimezone, String str, nScriptSetTimeZone nscriptsettimezone2) {
        super(nscriptsettimezone);
        this.read = fragmentBuilder_BindPersonalLimitFragment;
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = nscriptsettimezone2;
    }

    public final void write() {
        try {
            nScriptCCreate nscriptccreate = (nScriptCCreate) this.read.write.MediaSessionCompat$Token;
            String str = this.read.MediaBrowserCompat$ItemReceiver;
            FragmentBuilder_BindPersonalLimitFragment fragmentBuilder_BindPersonalLimitFragment = this.read;
            String str2 = this.write;
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("playcore.version.code", 10603);
            bundle.putAll(bundle2);
            bundle.putString("package.name", str2);
            Integer MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindPersonalLimitFragment.MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                bundle.putInt("app.version.code", MediaBrowserCompat$CustomActionResultReceiver.intValue());
            }
            nscriptccreate.write(str, bundle, new nScriptForEachClipped(this.read, this.MediaBrowserCompat$ItemReceiver, this.write));
        } catch (RemoteException e) {
            FragmentBuilder_BindPdfViewerFragment fragmentBuilder_BindPdfViewerFragment = FragmentBuilder_BindPersonalLimitFragment.IconCompatParcelizer;
            Object[] objArr = {this.write};
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", FragmentBuilder_BindPdfViewerFragment.read(fragmentBuilder_BindPdfViewerFragment.MediaBrowserCompat$CustomActionResultReceiver, "requestUpdateInfo(%s)", objArr), e);
            }
            nScriptSetTimeZone nscriptsettimezone = this.MediaBrowserCompat$ItemReceiver;
            nscriptsettimezone.MediaBrowserCompat$ItemReceiver.write(new RuntimeException(e));
        }
    }
}

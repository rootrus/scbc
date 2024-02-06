package p040o;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;

/* renamed from: o.nScriptForEachClipped */
final class nScriptForEachClipped extends nLoadIOSO<nIncObjDestroy> {
    private final String write;

    nScriptForEachClipped(FragmentBuilder_BindPersonalLimitFragment fragmentBuilder_BindPersonalLimitFragment, nScriptSetTimeZone<nIncObjDestroy> nscriptsettimezone, String str) {
        super(fragmentBuilder_BindPersonalLimitFragment, new FragmentBuilder_BindPdfViewerFragment("OnRequestInstallCallback"), nscriptsettimezone);
        this.write = str;
    }

    public final void write(Bundle bundle) throws RemoteException {
        super.write(bundle);
        if (bundle.getInt("error.code", -2) == 0 || bundle.getInt("error.code", -2) == 1) {
            nScriptSetTimeZone<T> nscriptsettimezone = this.MediaBrowserCompat$ItemReceiver;
            nscriptsettimezone.MediaBrowserCompat$ItemReceiver.read(new nIncObjDestroy(this.write, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent")));
            return;
        }
        nScriptSetTimeZone<T> nscriptsettimezone2 = this.MediaBrowserCompat$ItemReceiver;
        nscriptsettimezone2.MediaBrowserCompat$ItemReceiver.write(new InstallException(bundle.getInt("error.code", -2)));
    }
}

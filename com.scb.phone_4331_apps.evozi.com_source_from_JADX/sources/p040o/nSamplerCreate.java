package p040o;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;

/* renamed from: o.nSamplerCreate */
final class nSamplerCreate extends nLoadIOSO<Void> {
    nSamplerCreate(FragmentBuilder_BindPersonalLimitFragment fragmentBuilder_BindPersonalLimitFragment, nScriptSetTimeZone<Void> nscriptsettimezone) {
        super(fragmentBuilder_BindPersonalLimitFragment, new FragmentBuilder_BindPdfViewerFragment("OnCompleteUpdateCallback"), nscriptsettimezone);
    }

    public final void read(Bundle bundle) throws RemoteException {
        super.read(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            nScriptSetTimeZone<T> nscriptsettimezone = this.MediaBrowserCompat$ItemReceiver;
            nscriptsettimezone.MediaBrowserCompat$ItemReceiver.write(new InstallException(bundle.getInt("error.code", -2)));
            return;
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.read(null);
    }
}

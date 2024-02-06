package p040o;

import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: o.forEachSrcOut$MediaBrowserCompat$ItemReceiver */
public final class forEachSrcOut$MediaBrowserCompat$ItemReceiver implements IBinder.DeathRecipient {
    private final nScriptGroupSetInput read;

    private forEachSrcOut$MediaBrowserCompat$ItemReceiver() {
    }

    public forEachSrcOut$MediaBrowserCompat$ItemReceiver(nScriptGroupSetInput nscriptgroupsetinput) {
        this.read = nscriptgroupsetinput;
    }

    public final void binderDied() {
        nScriptGroupSetInput nscriptgroupsetinput = this.read;
        nscriptgroupsetinput.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("reportBinderDeath", new Object[0]);
        if (nscriptgroupsetinput.MediaDescriptionCompat.get() != null) {
            nscriptgroupsetinput.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("calling onBinderDied", new Object[0]);
            return;
        }
        nscriptgroupsetinput.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("%s : Binder has died.", nscriptgroupsetinput.IconCompatParcelizer);
        for (nScriptGroup2Execute nscriptgroup2execute : nscriptgroupsetinput.write) {
            nScriptSetTimeZone<?> nscriptsettimezone = nscriptgroup2execute.MediaBrowserCompat$CustomActionResultReceiver;
            if (nscriptsettimezone != null) {
                nscriptsettimezone.MediaBrowserCompat$ItemReceiver.write(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(nscriptgroupsetinput.IconCompatParcelizer).concat(" : Binder has died.")));
            }
        }
        nscriptgroupsetinput.write.clear();
    }
}

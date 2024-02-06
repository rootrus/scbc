package p040o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: o.ScriptIntrinsicConvolve5x5 */
public final class ScriptIntrinsicConvolve5x5 {
    public String write = "0";

    /* renamed from: o.ScriptIntrinsicConvolve5x5$write */
    public static final class write implements ServiceConnection {
        public final /* synthetic */ nScriptGroupSetInput read;

        private write() {
        }

        private write(nScriptGroupSetInput nscriptgroupsetinput, byte b) {
            this.read = nscriptgroupsetinput;
        }

        public /* synthetic */ write(nScriptGroupSetInput nscriptgroupsetinput) {
            this(nscriptgroupsetinput, (byte) 0);
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
            nScriptGroupSetInput nscriptgroupsetinput = this.read;
            nscriptgroupsetinput.IconCompatParcelizer().post(new nScriptIntrinsicBLAS_Single(this, iBinder));
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
            nScriptGroupSetInput nscriptgroupsetinput = this.read;
            nscriptgroupsetinput.IconCompatParcelizer().post(new nScriptIntrinsicBLAS_BNNM(this));
        }
    }
}

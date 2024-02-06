package p040o;

import android.content.SharedPreferences;
import java.util.List;

@HmlSetNTBPinActivity
/* renamed from: o.Short4 */
public final class Short4 {
    public validateEntries IconCompatParcelizer;
    public SharedPreferences MediaBrowserCompat$CustomActionResultReceiver;
    public List<setEntryLabelTextSize> MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.Short4$write */
    public static final class write implements Runnable {
        private final /* synthetic */ nScriptSetVarD MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ nScriptInvokeIDCreate read;

        private write() {
        }

        public write(nScriptSetVarD nscriptsetvard, nScriptInvokeIDCreate nscriptinvokeidcreate) {
            this.MediaBrowserCompat$CustomActionResultReceiver = nscriptsetvard;
            this.read = nscriptinvokeidcreate;
        }

        public final void run() {
            synchronized (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.read.IconCompatParcelizer());
                }
            }
        }
    }

    @HmlPinActivity
    public Short4(SharedPreferences sharedPreferences) {
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        this.MediaBrowserCompat$CustomActionResultReceiver = sharedPreferences;
    }
}

package p040o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: o.nScriptInvokeV */
final class nScriptInvokeV extends BroadcastReceiver {
    private final /* synthetic */ nScriptKernelIDCreate MediaBrowserCompat$CustomActionResultReceiver;

    private nScriptInvokeV(nScriptKernelIDCreate nscriptkernelidcreate) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nscriptkernelidcreate;
    }

    /* synthetic */ nScriptInvokeV(nScriptKernelIDCreate nscriptkernelidcreate, byte b) {
        this(nscriptkernelidcreate);
    }

    public final void onReceive(Context context, Intent intent) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(context, intent);
    }
}

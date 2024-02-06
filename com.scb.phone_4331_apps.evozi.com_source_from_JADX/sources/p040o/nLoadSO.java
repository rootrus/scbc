package p040o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: o.nLoadSO */
public final class nLoadSO extends nScriptKernelIDCreate<nScriptForEach> {
    public nLoadSO(Context context) {
        super(new FragmentBuilder_BindPdfViewerFragment("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    public final void read(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        FragmentBuilder_BindPdfViewerFragment fragmentBuilder_BindPdfViewerFragment = this.MediaBrowserCompat$ItemReceiver;
        fragmentBuilder_BindPdfViewerFragment.MediaBrowserCompat$CustomActionResultReceiver("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        fragmentBuilder_BindPdfViewerFragment.MediaBrowserCompat$CustomActionResultReceiver("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        fragmentBuilder_BindPdfViewerFragment.MediaBrowserCompat$CustomActionResultReceiver("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        nScriptForEach nscriptforeach = new nScriptForEach(intent.getIntExtra("install.status", 0), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver("ListenerRegistryBroadcastReceiver.onReceive: %s", nscriptforeach);
        read(nscriptforeach);
    }
}

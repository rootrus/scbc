package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p040o.AppCompatDialogFragment;

/* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$MediaBrowserCompat$CustomActionResultReceiver */
final class C0012xa11d3055 {
    private AppCompatDialogFragment IconCompatParcelizer;
    private BroadcastReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private IntentFilter MediaBrowserCompat$ItemReceiver;
    private boolean read;
    final /* synthetic */ AppCompatDelegateImpl write;

    C0012xa11d3055(AppCompatDelegateImpl appCompatDelegateImpl, AppCompatDialogFragment appCompatDialogFragment) {
        this.write = appCompatDelegateImpl;
        this.IconCompatParcelizer = appCompatDialogFragment;
        this.read = appCompatDialogFragment.write();
    }

    /* access modifiers changed from: package-private */
    public final int write() {
        boolean write2 = this.IconCompatParcelizer.write();
        this.read = write2;
        return write2 ? 2 : 1;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer() {
        boolean write2 = this.IconCompatParcelizer.write();
        if (write2 != this.read) {
            this.read = write2;
            this.write.write();
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        read();
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    C0012xa11d3055.this.IconCompatParcelizer();
                }
            };
        }
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            IntentFilter intentFilter = new IntentFilter();
            this.MediaBrowserCompat$ItemReceiver = intentFilter;
            intentFilter.addAction("android.intent.action.TIME_SET");
            this.MediaBrowserCompat$ItemReceiver.addAction("android.intent.action.TIMEZONE_CHANGED");
            this.MediaBrowserCompat$ItemReceiver.addAction("android.intent.action.TIME_TICK");
        }
        this.write.MediaBrowserCompat$MediaItem.registerReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.write.MediaBrowserCompat$MediaItem.unregisterReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
    }
}

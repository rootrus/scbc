package p040o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import p040o.loadInBackground;

/* renamed from: o.dispatchOnCancelled */
public final class dispatchOnCancelled implements loadInBackground {
    private boolean IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final BroadcastReceiver MediaBrowserCompat$ItemReceiver = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            boolean z = dispatchOnCancelled.this.MediaBrowserCompat$CustomActionResultReceiver;
            dispatchOnCancelled.this.MediaBrowserCompat$CustomActionResultReceiver = dispatchOnCancelled.MediaBrowserCompat$CustomActionResultReceiver(context);
            if (z != dispatchOnCancelled.this.MediaBrowserCompat$CustomActionResultReceiver) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("connectivity changed, isConnected: ");
                    sb.append(dispatchOnCancelled.this.MediaBrowserCompat$CustomActionResultReceiver);
                    Log.d("ConnectivityMonitor", sb.toString());
                }
                dispatchOnCancelled.this.read.read(dispatchOnCancelled.this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    };
    final loadInBackground.write read;
    private final Context write;

    public final void onDestroy() {
    }

    public dispatchOnCancelled(Context context, loadInBackground.write write2) {
        this.write = context.getApplicationContext();
        this.read = write2;
    }

    static boolean MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return false;
                }
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                }
                return true;
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public final void onStart() {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(this.write);
            try {
                this.write.registerReceiver(this.MediaBrowserCompat$ItemReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.IconCompatParcelizer = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    public final void onStop() {
        if (this.IconCompatParcelizer) {
            this.write.unregisterReceiver(this.MediaBrowserCompat$ItemReceiver);
            this.IconCompatParcelizer = false;
        }
    }
}

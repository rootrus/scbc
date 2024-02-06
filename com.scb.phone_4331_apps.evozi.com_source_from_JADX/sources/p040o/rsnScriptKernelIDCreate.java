package p040o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: o.rsnScriptKernelIDCreate */
public final class rsnScriptKernelIDCreate {
    public final Context IconCompatParcelizer;
    public final BroadcastReceiver MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem = false;
    public Runnable read;
    public Handler write;

    public rsnScriptKernelIDCreate(Context context, Runnable runnable) {
        this.IconCompatParcelizer = context;
        this.read = runnable;
        this.MediaBrowserCompat$CustomActionResultReceiver = new read(this, (byte) 0);
        this.write = new Handler();
    }

    /* renamed from: o.rsnScriptKernelIDCreate$read */
    final class read extends BroadcastReceiver {
        private read() {
        }

        /* synthetic */ read(rsnScriptKernelIDCreate rsnscriptkernelidcreate, byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z = intent.getIntExtra("plugged", -1) <= 0;
                rsnScriptKernelIDCreate.this.write.post(new Runnable() {
                    public final void run() {
                        rsnScriptKernelIDCreate rsnscriptkernelidcreate = rsnScriptKernelIDCreate.this;
                        rsnscriptkernelidcreate.MediaBrowserCompat$ItemReceiver = z;
                        if (rsnscriptkernelidcreate.MediaBrowserCompat$MediaItem) {
                            rsnscriptkernelidcreate.write.removeCallbacksAndMessages((Object) null);
                            if (rsnscriptkernelidcreate.MediaBrowserCompat$ItemReceiver) {
                                rsnscriptkernelidcreate.write.postDelayed(rsnscriptkernelidcreate.read, 300000);
                            }
                        }
                    }
                });
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.write.removeCallbacksAndMessages((Object) null);
        if (this.MediaBrowserCompat$MediaItem) {
            this.IconCompatParcelizer.unregisterReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$MediaItem = false;
        }
    }
}

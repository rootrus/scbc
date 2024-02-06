package p040o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: o.performPause */
final class performPause {
    private final Handler MediaBrowserCompat$CustomActionResultReceiver = new Handler(Looper.getMainLooper(), new IconCompatParcelizer());
    private boolean write;

    performPause() {
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(performOptionsMenuClosed<?> performoptionsmenuclosed) {
        synchronized (this) {
            if (this.write) {
                this.MediaBrowserCompat$CustomActionResultReceiver.obtainMessage(1, performoptionsmenuclosed).sendToTarget();
            } else {
                this.write = true;
                performoptionsmenuclosed.MediaBrowserCompat$CustomActionResultReceiver();
                this.write = false;
            }
        }
    }

    /* renamed from: o.performPause$IconCompatParcelizer */
    static final class IconCompatParcelizer implements Handler.Callback {
        IconCompatParcelizer() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((performOptionsMenuClosed) message.obj).MediaBrowserCompat$CustomActionResultReceiver();
            return true;
        }
    }
}

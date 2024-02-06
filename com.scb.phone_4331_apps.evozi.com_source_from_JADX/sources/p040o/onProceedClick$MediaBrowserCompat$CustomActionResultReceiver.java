package p040o;

import android.database.ContentObserver;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: o.onProceedClick$MediaBrowserCompat$CustomActionResultReceiver */
public class onProceedClick$MediaBrowserCompat$CustomActionResultReceiver extends ContentObserver {
    private WeakReference<onProceedClick> MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean deliverSelfNotifications() {
        return false;
    }

    public onProceedClick$MediaBrowserCompat$CustomActionResultReceiver(onProceedClick onproceedclick) {
        super((Handler) null);
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(onproceedclick);
    }

    public final void onChange(boolean z) {
        onProceedClick onproceedclick = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (onproceedclick != null) {
            synchronized (onproceedclick.MediaBrowserCompat$ItemReceiver) {
                onproceedclick.read.dispatchChange(false);
            }
        }
    }
}

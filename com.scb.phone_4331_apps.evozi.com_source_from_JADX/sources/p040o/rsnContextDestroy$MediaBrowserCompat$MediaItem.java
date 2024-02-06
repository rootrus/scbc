package p040o;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.maps.Projection;
import com.scb.phone.data.p033di.search.SequentialSearchRepositoryModule$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.rsnContextDestroy$MediaBrowserCompat$MediaItem */
class rsnContextDestroy$MediaBrowserCompat$MediaItem extends Handler implements Runnable {
    final /* synthetic */ rsnContextDestroy MediaBrowserCompat$CustomActionResultReceiver;
    rsnContextDestroy<T>.SearchResultReceiver read;
    private boolean write;

    private rsnContextDestroy$MediaBrowserCompat$MediaItem(rsnContextDestroy rsncontextdestroy) {
        this.MediaBrowserCompat$CustomActionResultReceiver = rsncontextdestroy;
        this.write = false;
        this.read = null;
    }

    /* synthetic */ rsnContextDestroy$MediaBrowserCompat$MediaItem(rsnContextDestroy rsncontextdestroy, byte b) {
        this(rsncontextdestroy);
    }

    public final void handleMessage(Message message) {
        rsnContextDestroy<T>.SearchResultReceiver searchResultReceiver;
        if (message.what == 1) {
            this.write = false;
            if (this.read != null) {
                sendEmptyMessage(0);
                return;
            }
            return;
        }
        removeMessages(0);
        if (!this.write && this.read != null) {
            Projection projection = this.MediaBrowserCompat$CustomActionResultReceiver.Keep.getProjection();
            synchronized (this) {
                searchResultReceiver = this.read;
                this.read = null;
                this.write = true;
            }
            searchResultReceiver.IconCompatParcelizer = this;
            searchResultReceiver.read = projection;
            float f = this.MediaBrowserCompat$CustomActionResultReceiver.Keep.getCameraPosition().zoom;
            searchResultReceiver.MediaBrowserCompat$ItemReceiver = f;
            searchResultReceiver.write = new SequentialSearchRepositoryModule$MediaBrowserCompat$ItemReceiver(Math.pow(2.0d, (double) Math.min(f, searchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.setContentView)) * 256.0d);
            new Thread(searchResultReceiver).start();
        }
    }

    public final void run() {
        sendEmptyMessage(1);
    }
}

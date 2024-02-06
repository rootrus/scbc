package p040o;

import android.hardware.Camera;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import p040o.onEmailUsClick;

/* renamed from: o.onEmailUsClick$MediaBrowserCompat$CustomActionResultReceiver */
class onEmailUsClick$MediaBrowserCompat$CustomActionResultReceiver implements Camera.PreviewCallback {
    private /* synthetic */ onEmailUsClick MediaBrowserCompat$CustomActionResultReceiver;

    private onEmailUsClick$MediaBrowserCompat$CustomActionResultReceiver(onEmailUsClick onemailusclick) {
        this.MediaBrowserCompat$CustomActionResultReceiver = onemailusclick;
    }

    /* synthetic */ onEmailUsClick$MediaBrowserCompat$CustomActionResultReceiver(onEmailUsClick onemailusclick, byte b) {
        this(onemailusclick);
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        onEmailUsClick.IconCompatParcelizer read = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem;
        synchronized (read.MediaBrowserCompat$ItemReceiver) {
            try {
                if (read.IconCompatParcelizer != null) {
                    camera.addCallbackBuffer(read.IconCompatParcelizer.array());
                    read.IconCompatParcelizer = null;
                }
                SystemClock.elapsedRealtime();
                read.write++;
                read.IconCompatParcelizer = (ByteBuffer) onEmailUsClick.this.MediaSessionCompat$Token.get(bArr);
                read.MediaBrowserCompat$ItemReceiver.notifyAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
    }
}

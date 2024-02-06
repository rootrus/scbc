package p040o;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p040o.zzgk;

/* renamed from: o.ScriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver */
public class C1277x72464c4d extends Handler {
    MotionEvent MediaBrowserCompat$CustomActionResultReceiver;
    public ScriptIntrinsic3DLUT write;

    public C1277x72464c4d(ScriptIntrinsic3DLUT scriptIntrinsic3DLUT) {
        this.write = scriptIntrinsic3DLUT;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = this.write;
            MotionEvent motionEvent = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (scriptIntrinsic3DLUT.PlaybackStateCompat) {
                scriptIntrinsic3DLUT.MediaBrowserCompat$ItemReceiver(scriptIntrinsic3DLUT.setShortcut, motionEvent, false);
            }
        } else if (i == 2) {
            this.write.write(true);
        } else if (i == 3) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT2 = this.write;
            RecyclerView.setContentView IconCompatParcelizer = scriptIntrinsic3DLUT2.setShortcut.IconCompatParcelizer(scriptIntrinsic3DLUT2.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver);
            if (IconCompatParcelizer != null) {
                int width = IconCompatParcelizer.write.getWidth();
                int height = IconCompatParcelizer.write.getHeight();
                if (width != scriptIntrinsic3DLUT2.MediaSessionCompat$QueueItem.MediaBrowserCompat$MediaItem || height != scriptIntrinsic3DLUT2.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver) {
                    zzgk.IconCompatParcelizer iconCompatParcelizer = new zzgk.IconCompatParcelizer(scriptIntrinsic3DLUT2.MediaSessionCompat$QueueItem, IconCompatParcelizer);
                    scriptIntrinsic3DLUT2.MediaSessionCompat$QueueItem = iconCompatParcelizer;
                    scriptIntrinsic3DLUT2.MediaBrowserCompat$SearchResultReceiver.write(iconCompatParcelizer, IconCompatParcelizer);
                }
            }
        }
    }
}

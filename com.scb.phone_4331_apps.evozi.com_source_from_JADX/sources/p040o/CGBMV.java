package p040o;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: o.CGBMV */
public final class CGBMV {
    private static final Collection<String> read;
    private static final String write = CGBMV.class.getSimpleName();
    private final Camera IconCompatParcelizer;
    private final Camera.AutoFocusCallback MediaBrowserCompat$CustomActionResultReceiver = new Object() {
        public final void onAutoFocus(boolean z, Camera camera) {
            CGBMV.this.RatingCompat.post(this);
        }

        public final void run() {
            boolean unused = CGBMV.this.MediaMetadataCompat = false;
            CGBMV.this.MediaBrowserCompat$CustomActionResultReceiver();
        }
    };
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$ItemReceiver = 1;
    private final Handler.Callback MediaBrowserCompat$MediaItem = new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what != CGBMV.this.MediaBrowserCompat$ItemReceiver) {
                return false;
            }
            CGBMV.this.MediaBrowserCompat$ItemReceiver();
            return true;
        }
    };
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private final boolean MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public boolean MediaMetadataCompat;
    /* access modifiers changed from: private */
    public Handler RatingCompat = new Handler(this.MediaBrowserCompat$MediaItem);

    static {
        ArrayList arrayList = new ArrayList(2);
        read = arrayList;
        arrayList.add("auto");
        read.add("macro");
    }

    public CGBMV(Camera camera, CHER cher) {
        boolean z = true;
        this.IconCompatParcelizer = camera;
        String focusMode = camera.getParameters().getFocusMode();
        this.MediaDescriptionCompat = (!cher.read || !read.contains(focusMode)) ? false : z;
        String str = write;
        StringBuilder sb = new StringBuilder();
        sb.append("Current focus mode '");
        sb.append(focusMode);
        sb.append("'; use auto focus? ");
        sb.append(this.MediaDescriptionCompat);
        Log.i(str, sb.toString());
        this.MediaBrowserCompat$SearchResultReceiver = false;
        MediaBrowserCompat$ItemReceiver();
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$CustomActionResultReceiver() {
        synchronized (this) {
            if (!this.MediaBrowserCompat$SearchResultReceiver && !this.RatingCompat.hasMessages(this.MediaBrowserCompat$ItemReceiver)) {
                this.RatingCompat.sendMessageDelayed(this.RatingCompat.obtainMessage(this.MediaBrowserCompat$ItemReceiver), 2000);
            }
        }
    }

    public final void IconCompatParcelizer() {
        this.MediaBrowserCompat$SearchResultReceiver = false;
        MediaBrowserCompat$ItemReceiver();
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$ItemReceiver() {
        if (this.MediaDescriptionCompat && !this.MediaBrowserCompat$SearchResultReceiver && !this.MediaMetadataCompat) {
            try {
                this.IconCompatParcelizer.autoFocus(this.MediaBrowserCompat$CustomActionResultReceiver);
                this.MediaMetadataCompat = true;
            } catch (RuntimeException e) {
                Log.w(write, "Unexpected exception while focusing", e);
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    public final void write() {
        this.MediaBrowserCompat$SearchResultReceiver = true;
        this.MediaMetadataCompat = false;
        this.RatingCompat.removeMessages(this.MediaBrowserCompat$ItemReceiver);
        if (this.MediaDescriptionCompat) {
            try {
                this.IconCompatParcelizer.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w(write, "Unexpected exception while cancelling focusing", e);
            }
        }
    }
}

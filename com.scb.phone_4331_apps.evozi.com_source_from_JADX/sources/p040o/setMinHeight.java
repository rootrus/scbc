package p040o;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: o.setMinHeight */
public final class setMinHeight<T> {
    private static final Executor RatingCompat = new write();
    final Executor IconCompatParcelizer;
    public List<T> MediaBrowserCompat$CustomActionResultReceiver = Collections.emptyList();
    public int MediaBrowserCompat$ItemReceiver;
    public final CheckExtractActivity MediaBrowserCompat$MediaItem;
    public List<T> read;
    public final C10826setId<T> write;

    /* renamed from: o.setMinHeight$write */
    static class write implements Executor {
        final Handler MediaBrowserCompat$ItemReceiver = new Handler(Looper.getMainLooper());

        write() {
        }

        public final void execute(Runnable runnable) {
            this.MediaBrowserCompat$ItemReceiver.post(runnable);
        }
    }

    public setMinHeight(CheckExtractActivity checkExtractActivity, C10826setId<T> setid) {
        this.MediaBrowserCompat$MediaItem = checkExtractActivity;
        this.write = setid;
        if (setid.write != null) {
            this.IconCompatParcelizer = setid.write;
        } else {
            this.IconCompatParcelizer = RatingCompat;
        }
    }
}

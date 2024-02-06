package p040o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: o.AudioAttributesImplBaseParcelizer */
public final class AudioAttributesImplBaseParcelizer {
    private static final Executor MediaBrowserCompat$ItemReceiver = new Executor() {
        private final Handler write = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.write.post(runnable);
        }
    };
    private static final Executor write = new Executor() {
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    public static Executor write() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public static Executor MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}

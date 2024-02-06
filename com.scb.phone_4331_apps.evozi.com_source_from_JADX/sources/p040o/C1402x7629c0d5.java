package p040o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: o.nScriptIntrinsicCreate$MediaBrowserCompat$CustomActionResultReceiver */
final class C1402x7629c0d5 implements Executor {
    private final Handler read = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.read.post(runnable);
    }
}

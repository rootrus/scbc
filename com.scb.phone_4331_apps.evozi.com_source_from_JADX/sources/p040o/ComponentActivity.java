package p040o;

import android.animation.Animator;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: o.ComponentActivity */
public final class ComponentActivity implements ICheckExtractorListener {
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final Set<executePendingTask> MediaBrowserCompat$ItemReceiver = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: o.ComponentActivity$IconCompatParcelizer */
    interface IconCompatParcelizer {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    public final void read(executePendingTask executependingtask) {
        this.MediaBrowserCompat$ItemReceiver.add(executependingtask);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            executependingtask.onDestroy();
        } else if (this.IconCompatParcelizer) {
            executependingtask.onStart();
        } else {
            executependingtask.onStop();
        }
    }

    public final void write() {
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        for (T onDestroy : LinearLayoutManager.write(this.MediaBrowserCompat$ItemReceiver)) {
            onDestroy.onDestroy();
        }
    }

    public final void read() {
        this.IconCompatParcelizer = true;
        for (T onStart : LinearLayoutManager.write(this.MediaBrowserCompat$ItemReceiver)) {
            onStart.onStart();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.IconCompatParcelizer = false;
        for (T onStop : LinearLayoutManager.write(this.MediaBrowserCompat$ItemReceiver)) {
            onStop.onStop();
        }
    }

    public final void write(executePendingTask executependingtask) {
        this.MediaBrowserCompat$ItemReceiver.remove(executependingtask);
    }
}

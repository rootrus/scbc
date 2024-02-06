package p040o;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: o.SGBMV */
public abstract class SGBMV<T extends Animator> {
    protected long MediaBrowserCompat$CustomActionResultReceiver = 350;
    protected T read;
    protected DSYMM$MediaBrowserCompat$ItemReceiver write;

    public abstract SGBMV IconCompatParcelizer(float f);

    public abstract T MediaBrowserCompat$CustomActionResultReceiver();

    public SGBMV(DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        this.write = dSYMM$MediaBrowserCompat$ItemReceiver;
        this.read = MediaBrowserCompat$CustomActionResultReceiver();
    }

    public SGBMV MediaBrowserCompat$ItemReceiver(long j) {
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        T t = this.read;
        if (t instanceof ValueAnimator) {
            t.setDuration(j);
        }
        return this;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        T t = this.read;
        if (t != null && !t.isRunning()) {
            this.read.start();
        }
    }

    public final void IconCompatParcelizer() {
        T t = this.read;
        if (t != null && t.isStarted()) {
            this.read.end();
        }
    }
}

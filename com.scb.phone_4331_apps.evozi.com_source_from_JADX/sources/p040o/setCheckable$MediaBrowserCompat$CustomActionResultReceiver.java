package p040o;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import p040o.setCheckable;

/* renamed from: o.setCheckable$MediaBrowserCompat$CustomActionResultReceiver */
class setCheckable$MediaBrowserCompat$CustomActionResultReceiver extends setCheckable$MediaBrowserCompat$MediaItem {
    private final ObjectAnimator read;
    private final boolean write;

    setCheckable$MediaBrowserCompat$CustomActionResultReceiver(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        super();
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        setCheckable.read read2 = new setCheckable.read(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
        if (Build.VERSION.SDK_INT >= 18) {
            ofInt.setAutoCancel(true);
        }
        ofInt.setDuration((long) read2.MediaBrowserCompat$ItemReceiver());
        ofInt.setInterpolator(read2);
        this.write = z2;
        this.read = ofInt;
    }

    public boolean write() {
        return this.write;
    }

    public void read() {
        this.read.start();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        this.read.reverse();
    }

    public void MediaBrowserCompat$ItemReceiver() {
        this.read.cancel();
    }
}

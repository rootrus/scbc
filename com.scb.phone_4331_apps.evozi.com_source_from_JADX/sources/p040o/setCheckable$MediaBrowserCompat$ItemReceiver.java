package p040o;

import android.graphics.drawable.Animatable;

/* renamed from: o.setCheckable$MediaBrowserCompat$ItemReceiver */
class setCheckable$MediaBrowserCompat$ItemReceiver extends setCheckable$MediaBrowserCompat$MediaItem {
    private final Animatable read;

    setCheckable$MediaBrowserCompat$ItemReceiver(Animatable animatable) {
        super();
        this.read = animatable;
    }

    public void read() {
        this.read.start();
    }

    public void MediaBrowserCompat$ItemReceiver() {
        this.read.stop();
    }
}

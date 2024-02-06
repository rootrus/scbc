package p040o;

import android.graphics.drawable.Drawable;

@Deprecated
/* renamed from: o.forceLoad */
public abstract class forceLoad<Z> implements onAbandon<Z> {
    private commitContentChanged write;

    public void IconCompatParcelizer(Drawable drawable) {
    }

    public final void onDestroy() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void read(Drawable drawable) {
    }

    public void write(Drawable drawable) {
    }

    public void MediaBrowserCompat$ItemReceiver(commitContentChanged commitcontentchanged) {
        this.write = commitcontentchanged;
    }

    public commitContentChanged read() {
        return this.write;
    }
}

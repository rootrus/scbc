package p040o;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: o.isStarted */
public abstract class isStarted<Z> extends C1430reset<ImageView, Z> {
    private Animatable read;

    /* access modifiers changed from: protected */
    public abstract void write(Z z);

    public isStarted(ImageView imageView) {
        super(imageView);
    }

    public final void read(Drawable drawable) {
        super.read(drawable);
        MediaBrowserCompat$CustomActionResultReceiver((Object) null);
        ((ImageView) this.write).setImageDrawable(drawable);
    }

    public final void IconCompatParcelizer(Drawable drawable) {
        super.IconCompatParcelizer(drawable);
        MediaBrowserCompat$CustomActionResultReceiver((Object) null);
        ((ImageView) this.write).setImageDrawable(drawable);
    }

    public final void write(Drawable drawable) {
        super.write(drawable);
        Animatable animatable = this.read;
        if (animatable != null) {
            animatable.stop();
        }
        MediaBrowserCompat$CustomActionResultReceiver((Object) null);
        ((ImageView) this.write).setImageDrawable(drawable);
    }

    public final void MediaBrowserCompat$ItemReceiver(Z z) {
        MediaBrowserCompat$CustomActionResultReceiver(z);
    }

    public final void onStart() {
        Animatable animatable = this.read;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void onStop() {
        Animatable animatable = this.read;
        if (animatable != null) {
            animatable.stop();
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Z z) {
        write(z);
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.read = animatable;
            animatable.start();
            return;
        }
        this.read = null;
    }
}

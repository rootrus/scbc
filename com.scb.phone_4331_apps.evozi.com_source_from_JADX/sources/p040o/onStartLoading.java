package p040o;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: o.onStartLoading */
public final class onStartLoading extends isStarted<Drawable> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void write(Object obj) {
        ((ImageView) this.write).setImageDrawable((Drawable) obj);
    }

    public onStartLoading(ImageView imageView) {
        super(imageView);
    }
}

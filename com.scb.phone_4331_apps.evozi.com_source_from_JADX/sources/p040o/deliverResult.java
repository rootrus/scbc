package p040o;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: o.deliverResult */
public final class deliverResult extends isStarted<Bitmap> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void write(Object obj) {
        ((ImageView) this.write).setImageBitmap((Bitmap) obj);
    }

    public deliverResult(ImageView imageView) {
        super(imageView);
    }
}

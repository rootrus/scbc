package p040o;

import android.view.ViewTreeObserver;
import com.lyft.android.scissors.CropView;

/* renamed from: o.CTRSV$MediaBrowserCompat$CustomActionResultReceiver */
public class CTRSV$MediaBrowserCompat$CustomActionResultReceiver {
    public final CropView IconCompatParcelizer;
    public IdExtractor_Factory write;

    public CTRSV$MediaBrowserCompat$CustomActionResultReceiver(CropView cropView) {
        DGBMV.IconCompatParcelizer(cropView, "cropView == null");
        this.IconCompatParcelizer = cropView;
    }

    public final void IconCompatParcelizer(Object obj) {
        if (this.write == null) {
            this.write = CTRSV.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        this.write.write(obj, this.IconCompatParcelizer);
    }

    public final void write(final Object obj) {
        if (this.IconCompatParcelizer.getViewTreeObserver().isAlive()) {
            this.IconCompatParcelizer.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    if (CTRSV$MediaBrowserCompat$CustomActionResultReceiver.this.IconCompatParcelizer.getViewTreeObserver().isAlive()) {
                        CTRSV$MediaBrowserCompat$CustomActionResultReceiver.this.IconCompatParcelizer.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    CTRSV$MediaBrowserCompat$CustomActionResultReceiver.this.IconCompatParcelizer(obj);
                }
            });
        }
    }
}

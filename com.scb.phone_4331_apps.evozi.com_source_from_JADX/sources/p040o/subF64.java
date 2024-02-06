package p040o;

import android.view.GestureDetector;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;
import p040o.isComplex;

/* renamed from: o.subF64 */
public abstract class subF64<T extends Chart<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public isComplex.C13709 IconCompatParcelizer;
    protected int MediaBrowserCompat$CustomActionResultReceiver = 0;
    protected T read;
    protected GestureDetector write;

    /* renamed from: o.subF64$read */
    public enum read {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public subF64(T t) {
        read read2 = read.NONE;
        this.read = t;
        this.write = new GestureDetector(t.getContext(), this);
    }

    /* access modifiers changed from: protected */
    public final void write(isComplex.C13709 r4) {
        if (r4 != null) {
            isComplex.C13709 r0 = this.IconCompatParcelizer;
            if (!(r0 != null && r4.write == r0.write && r4.MediaBrowserCompat$SearchResultReceiver == r0.MediaBrowserCompat$SearchResultReceiver && r4.MediaMetadataCompat == r0.MediaMetadataCompat && r4.MediaBrowserCompat$CustomActionResultReceiver == r0.MediaBrowserCompat$CustomActionResultReceiver)) {
                this.read.write(r4);
                this.IconCompatParcelizer = r4;
                return;
            }
        }
        this.read.write((isComplex.C13709) null);
        this.IconCompatParcelizer = null;
    }
}

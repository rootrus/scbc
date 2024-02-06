package p040o;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: o.rsnElementCreate */
public final class rsnElementCreate extends Drawable {
    public int IconCompatParcelizer = -1;
    private final Drawable read;
    private final Drawable write;

    public final int getOpacity() {
        return -3;
    }

    public rsnElementCreate(Resources resources) {
        this.write = resources.getDrawable(C1432x6bf5cdc3.amu_bubble_mask);
        this.read = resources.getDrawable(C1432x6bf5cdc3.amu_bubble_shadow);
    }

    public final void draw(Canvas canvas) {
        this.write.draw(canvas);
        canvas.drawColor(this.IconCompatParcelizer, PorterDuff.Mode.SRC_IN);
        this.read.draw(canvas);
    }

    public final void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        this.write.setBounds(i, i2, i3, i4);
        this.read.setBounds(i, i2, i3, i4);
    }

    public final void setBounds(Rect rect) {
        this.write.setBounds(rect);
        this.read.setBounds(rect);
    }

    public final boolean getPadding(Rect rect) {
        return this.write.getPadding(rect);
    }
}

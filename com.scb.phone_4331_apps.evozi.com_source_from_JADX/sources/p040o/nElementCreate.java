package p040o;

import android.graphics.Outline;

/* renamed from: o.nElementCreate */
public final class nElementCreate extends nIncAllocationCreateTyped {
    public final void getOutline(Outline outline) {
        copyBounds(this.RatingCompat);
        outline.setOval(this.RatingCompat);
    }
}

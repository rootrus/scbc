package p040o;

import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.PixelBuffer */
public final /* synthetic */ class PixelBuffer implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ PixelBuffer IconCompatParcelizer = new PixelBuffer();

    private /* synthetic */ PixelBuffer() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv.MediaDescriptionCompat) obj).write(true);
    }
}

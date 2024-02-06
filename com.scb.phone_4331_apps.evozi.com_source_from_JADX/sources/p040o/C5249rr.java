package p040o;

import p040o.C7425sA;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.rr */
public final /* synthetic */ class C5249rr implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C7425sA.write write;

    public /* synthetic */ C5249rr(C7425sA.write write2) {
        this.write = write2;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTopLeftCornerWidth.MediaMetadataCompat mediaMetadataCompat = (getTopLeftCornerWidth.MediaMetadataCompat) obj;
        mediaMetadataCompat.IconCompatParcelizer(C7425sA.RatingCompat(C7425sA.this));
        mediaMetadataCompat.write();
    }
}

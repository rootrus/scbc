package p040o;

import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCropCornerColor */
public final /* synthetic */ class setCropCornerColor implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ setCropCornerColor write = new setCropCornerColor();

    private /* synthetic */ setCropCornerColor() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getMicrAmount.RatingCompat) obj).write();
    }
}

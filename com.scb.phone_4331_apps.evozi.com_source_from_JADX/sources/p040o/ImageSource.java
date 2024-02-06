package p040o;

import p040o.getImageHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.ImageSource */
public final /* synthetic */ class ImageSource implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ ImageSource read = new ImageSource();

    private /* synthetic */ ImageSource() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getImageHeight.write) obj).write();
    }
}

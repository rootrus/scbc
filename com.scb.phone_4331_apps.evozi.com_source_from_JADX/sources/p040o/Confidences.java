package p040o;

import p040o.CheckExtractActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.Confidences */
public final /* synthetic */ class Confidences implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getBinaryImagesFile read;

    public /* synthetic */ Confidences(getBinaryImagesFile getbinaryimagesfile) {
        this.read = getbinaryimagesfile;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity.IconCompatParcelizer) obj).write(this.read);
    }
}

package p040o;

import p040o.OcrFailureData;
import p040o.writeUInt64NoTag;

/* renamed from: o.writeTiffImage */
public final /* synthetic */ class writeTiffImage implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ writeTiffImage read = new writeTiffImage();

    private /* synthetic */ writeTiffImage() {
    }

    public final void IconCompatParcelizer(Object obj) {
        OcrFailureData.write.read((getDocumentState) obj);
    }
}

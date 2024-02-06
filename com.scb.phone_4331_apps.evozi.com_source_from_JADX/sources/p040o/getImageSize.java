package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImageSize */
public final /* synthetic */ class getImageSize implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean write;

    public /* synthetic */ getImageSize(boolean z) {
        this.write = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageFileRepresentation.read(this.write, (CheckExtractActivity_MembersInjector.AppCompatDialogFragment) obj);
    }
}

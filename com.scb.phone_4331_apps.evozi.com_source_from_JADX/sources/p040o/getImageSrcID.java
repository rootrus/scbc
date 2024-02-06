package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImageSrcID */
public final /* synthetic */ class getImageSrcID implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean read;

    public /* synthetic */ getImageSrcID(boolean z) {
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.AppCompatDialogFragment) obj).read(this.read);
    }
}

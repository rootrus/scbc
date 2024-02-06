package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ReferenceFeature */
public final /* synthetic */ class ReferenceFeature implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSessionFileProvider read;

    public /* synthetic */ ReferenceFeature(getSessionFileProvider getsessionfileprovider) {
        this.read = getsessionfileprovider;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1157x4c69105f) obj).write(this.read);
    }
}

package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.post */
public final /* synthetic */ class post implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;

    public /* synthetic */ post(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getVariant) obj).write(this.IconCompatParcelizer);
    }
}

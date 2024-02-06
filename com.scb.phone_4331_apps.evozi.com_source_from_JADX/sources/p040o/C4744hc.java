package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.hc */
public final /* synthetic */ class C4744hc implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCustomAttributes write;

    public /* synthetic */ C4744hc(getCustomAttributes getcustomattributes) {
        this.write = getcustomattributes;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((LocalProjectProvider.VersionTable) obj).write(this.write);
    }
}

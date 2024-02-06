package p040o;

import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.sa */
public final /* synthetic */ class C5253sa implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C5174qT IconCompatParcelizer;

    public /* synthetic */ C5253sa(C5174qT qTVar) {
        this.IconCompatParcelizer = qTVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((ServerProjectProvider.C70706) obj).write(this.IconCompatParcelizer.read, false);
    }
}

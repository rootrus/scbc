package p040o;

import p040o.C10881getCAR;
import p040o.writeUInt64NoTag;

/* renamed from: o.getExpiresAtMillis */
public final /* synthetic */ class getExpiresAtMillis implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ListenableFutureTask write;

    public /* synthetic */ getExpiresAtMillis(ListenableFutureTask listenableFutureTask) {
        this.write = listenableFutureTask;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C10881getCAR.IconCompatParcelizer) obj).read(this.write);
    }
}

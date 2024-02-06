package p040o;

import p040o.IdCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.expect */
public final /* synthetic */ class expect implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ newFactory write;

    public /* synthetic */ expect(newFactory newfactory) {
        this.write = newfactory;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule.C6905a) obj).read(this.write.read, true);
    }
}

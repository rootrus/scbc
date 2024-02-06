package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.JsonObject */
public final /* synthetic */ class JsonObject implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ isEagerInDefaultApp write;

    public /* synthetic */ JsonObject(isEagerInDefaultApp iseagerindefaultapp) {
        this.write = iseagerindefaultapp;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule) obj).write(this.write);
    }
}

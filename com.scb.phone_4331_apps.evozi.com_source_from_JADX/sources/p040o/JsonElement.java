package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.JsonElement */
public final /* synthetic */ class JsonElement implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ isEagerInDefaultApp write;

    public /* synthetic */ JsonElement(isEagerInDefaultApp iseagerindefaultapp) {
        this.write = iseagerindefaultapp;
    }

    public final void IconCompatParcelizer(Object obj) {
        checkNotPrimitive.read(this.write, (isOcrRead) obj);
    }
}

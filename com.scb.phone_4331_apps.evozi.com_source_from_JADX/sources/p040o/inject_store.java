package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.inject_store */
public final /* synthetic */ class inject_store implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ access$2200 read;

    public /* synthetic */ inject_store(access$2200 access_2200) {
        this.read = access_2200;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((isUndefined) obj).write(this.read);
    }
}

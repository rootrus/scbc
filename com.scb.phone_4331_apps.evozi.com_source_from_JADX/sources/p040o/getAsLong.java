package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getAsLong */
public final /* synthetic */ class getAsLong implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean read;

    public /* synthetic */ getAsLong(boolean z) {
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        C$Gson$Types.read(this.read, (getMiddleName) obj);
    }
}

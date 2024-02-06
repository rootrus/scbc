package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeGetPermissions */
public final /* synthetic */ class nativeGetPermissions implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String write;

    public /* synthetic */ nativeGetPermissions(String str) {
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPayee) obj).write(this.write);
    }
}

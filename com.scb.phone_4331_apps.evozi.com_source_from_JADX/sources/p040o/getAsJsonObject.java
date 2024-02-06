package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getAsJsonObject */
public final /* synthetic */ class getAsJsonObject implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ checkNotPrimitive write;

    public /* synthetic */ getAsJsonObject(checkNotPrimitive checknotprimitive) {
        this.write = checknotprimitive;
    }

    public final void IconCompatParcelizer(Object obj) {
        checkNotPrimitive checknotprimitive = this.write;
        ((isOcrRead) obj).write(checknotprimitive.write.write(1, true, checknotprimitive.MediaBrowserCompat$ItemReceiver));
    }
}

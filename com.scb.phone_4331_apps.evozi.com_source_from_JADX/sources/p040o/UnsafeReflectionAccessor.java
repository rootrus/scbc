package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.UnsafeReflectionAccessor */
public final /* synthetic */ class UnsafeReflectionAccessor implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ UnsafeReflectionAccessor write = new UnsafeReflectionAccessor();

    private /* synthetic */ UnsafeReflectionAccessor() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdParameters.IdState) obj).read();
    }
}

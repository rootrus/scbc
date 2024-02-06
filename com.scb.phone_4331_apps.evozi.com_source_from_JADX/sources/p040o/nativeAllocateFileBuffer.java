package p040o;

import p040o.CreditCard;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeAllocateFileBuffer */
public final /* synthetic */ class nativeAllocateFileBuffer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ finalizePreviousNativeSession read;

    public /* synthetic */ nativeAllocateFileBuffer(finalizePreviousNativeSession finalizepreviousnativesession) {
        this.read = finalizepreviousnativesession;
    }

    public final void IconCompatParcelizer(Object obj) {
        releaseFileBuffer.write(this.read, (CreditCard.C11681) obj);
    }
}

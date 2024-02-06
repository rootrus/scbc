package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeIsLicensed */
public final /* synthetic */ class nativeIsLicensed implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setStartCap write;

    public /* synthetic */ nativeIsLicensed(setStartCap setstartcap) {
        this.write = setstartcap;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPayee) obj).IconCompatParcelizer(this.write.write);
    }
}

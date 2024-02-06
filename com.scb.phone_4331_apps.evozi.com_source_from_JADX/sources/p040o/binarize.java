package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.binarize */
public final /* synthetic */ class binarize implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String write;

    public /* synthetic */ binarize(String str) {
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetUriKtaFactory) obj).write(this.write);
    }
}

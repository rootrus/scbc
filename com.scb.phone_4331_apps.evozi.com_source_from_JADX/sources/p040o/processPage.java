package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.processPage */
public final /* synthetic */ class processPage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ processPage(int i) {
        this.IconCompatParcelizer = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetUriKtaFactory) obj).read(this.IconCompatParcelizer);
    }
}

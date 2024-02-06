package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.fromNv21 */
public final /* synthetic */ class fromNv21 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String write;

    public /* synthetic */ fromNv21(String str) {
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetUriKtaFactory) obj).read(this.write);
    }
}

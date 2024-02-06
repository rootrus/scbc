package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.SendException */
public final /* synthetic */ class SendException implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ String write;

    public /* synthetic */ SendException(String str, String str2) {
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setResultDeserializer) obj).write(this.write, this.IconCompatParcelizer);
    }
}

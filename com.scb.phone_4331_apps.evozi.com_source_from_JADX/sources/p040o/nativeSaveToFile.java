package p040o;

import p040o.IdCaptureModule_GetIIdDeserializerKtaFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeSaveToFile */
public final /* synthetic */ class nativeSaveToFile implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ nativeSaveToFile write = new nativeSaveToFile();

    private /* synthetic */ nativeSaveToFile() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule_GetIIdDeserializerKtaFactory.read) obj).write();
    }
}

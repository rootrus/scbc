package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.saveBitmap */
public final /* synthetic */ class saveBitmap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String write;

    public /* synthetic */ saveBitmap(String str) {
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        setResultCode.MediaBrowserCompat$ItemReceiver(this.write, (PassportCaptureModule.RttiExceptionResponseDeserializer) obj);
    }
}

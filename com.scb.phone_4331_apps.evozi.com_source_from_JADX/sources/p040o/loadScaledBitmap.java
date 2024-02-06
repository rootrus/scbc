package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.loadScaledBitmap */
public final /* synthetic */ class loadScaledBitmap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFatalSessionFilesDir read;

    public /* synthetic */ loadScaledBitmap(getFatalSessionFilesDir getfatalsessionfilesdir) {
        this.read = getfatalsessionfilesdir;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.RttiExceptionResponseDeserializer) obj).IconCompatParcelizer(this.read.IconCompatParcelizer, this.read.MediaBrowserCompat$ItemReceiver);
    }
}

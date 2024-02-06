package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.imgMimeTypetoIpFileType */
public final /* synthetic */ class imgMimeTypetoIpFileType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFatalSessionFilesDir write;

    public /* synthetic */ imgMimeTypetoIpFileType(getFatalSessionFilesDir getfatalsessionfilesdir) {
        this.write = getfatalsessionfilesdir;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.RttiExceptionResponseDeserializer) obj).read(this.write);
    }
}

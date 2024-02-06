package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.rotateBitmap */
public final /* synthetic */ class rotateBitmap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFatalSessionFilesDir read;

    public /* synthetic */ rotateBitmap(getFatalSessionFilesDir getfatalsessionfilesdir) {
        this.read = getfatalsessionfilesdir;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.RttiExceptionResponseDeserializer) obj).MediaDescriptionCompat(this.read.PlaybackStateCompat$CustomAction);
    }
}

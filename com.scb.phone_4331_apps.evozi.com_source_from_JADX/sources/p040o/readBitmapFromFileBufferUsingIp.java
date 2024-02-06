package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.readBitmapFromFileBufferUsingIp */
public final /* synthetic */ class readBitmapFromFileBufferUsingIp implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFatalSessionFilesDir MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ readBitmapFromFileBufferUsingIp(getFatalSessionFilesDir getfatalsessionfilesdir) {
        this.MediaBrowserCompat$ItemReceiver = getfatalsessionfilesdir;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.RttiExceptionResponseDeserializer) obj).write(this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo, this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token);
    }
}

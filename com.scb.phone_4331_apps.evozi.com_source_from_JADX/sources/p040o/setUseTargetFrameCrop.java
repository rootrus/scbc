package p040o;

import p040o.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory;
import p040o.PassportDetectionSettings;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setUseTargetFrameCrop */
public final /* synthetic */ class setUseTargetFrameCrop implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ PassportDetectionSettings.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ setUseTargetFrameCrop(PassportDetectionSettings.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        PassportDetectionSettings.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((CheckCaptureModule_RttiExceptionResponseDeserializer_Factory.write) obj).write(PassportDetectionSettings.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.NAVIGATE_BACK));
    }
}

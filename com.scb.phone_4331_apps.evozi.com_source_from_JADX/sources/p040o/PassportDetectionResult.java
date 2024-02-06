package p040o;

import p040o.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory;
import p040o.PassportDetectionSettings;
import p040o.writeUInt64NoTag;

/* renamed from: o.PassportDetectionResult */
public final /* synthetic */ class PassportDetectionResult implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ PassportDetectionSettings.IconCompatParcelizer IconCompatParcelizer;
    private final /* synthetic */ getUuidUtf8Bytes write;

    public /* synthetic */ PassportDetectionResult(PassportDetectionSettings.IconCompatParcelizer iconCompatParcelizer, getUuidUtf8Bytes getuuidutf8bytes) {
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.write = getuuidutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        CheckCaptureModule_RttiExceptionResponseDeserializer_Factory.write write2 = (CheckCaptureModule_RttiExceptionResponseDeserializer_Factory.write) obj;
        write2.write(this.write, PassportDetectionSettings.this.MediaBrowserCompat$ItemReceiver);
    }
}

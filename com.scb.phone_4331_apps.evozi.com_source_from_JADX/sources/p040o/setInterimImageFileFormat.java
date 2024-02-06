package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.setInterimImageFileFormat */
public final /* synthetic */ class setInterimImageFileFormat implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setResultCode MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setInterimImageFileFormat(setResultCode setresultcode) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setresultcode;
    }

    public final void IconCompatParcelizer(Object obj) {
        setResultCode setresultcode = this.MediaBrowserCompat$CustomActionResultReceiver;
        PassportCaptureModule.RttiExceptionResponseDeserializer rttiExceptionResponseDeserializer = (PassportCaptureModule.RttiExceptionResponseDeserializer) obj;
        rttiExceptionResponseDeserializer.IconCompatParcelizer(getPageID$MediaBrowserCompat$ItemReceiver.MAILING_ADDRESS);
        rttiExceptionResponseDeserializer.mo37808x50fd9e4a();
        setresultcode.read(getPageID$MediaBrowserCompat$ItemReceiver.MAILING_ADDRESS, true);
        rttiExceptionResponseDeserializer.write(getPageID$MediaBrowserCompat$ItemReceiver.MAILING_ADDRESS);
    }
}

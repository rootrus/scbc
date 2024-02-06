package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getRequestUserName$MediaBrowserCompat$CustomActionResultReceiver */
public final class getRequestUserName$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_RttiExceptionResponseDeserializer_Factory> {
    private /* synthetic */ getRequestUserName IconCompatParcelizer;

    public getRequestUserName$MediaBrowserCompat$CustomActionResultReceiver(getRequestUserName getrequestusername) {
        this.IconCompatParcelizer = getrequestusername;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        PassportCaptureModule_RttiExceptionResponseDeserializer_Factory passportCaptureModule_RttiExceptionResponseDeserializer_Factory = (PassportCaptureModule_RttiExceptionResponseDeserializer_Factory) obj;
        if (this.IconCompatParcelizer.write.IconCompatParcelizer.write.read() != null) {
            passportCaptureModule_RttiExceptionResponseDeserializer_Factory.MediaBrowserCompat$ItemReceiver();
        } else {
            passportCaptureModule_RttiExceptionResponseDeserializer_Factory.IconCompatParcelizer();
        }
    }
}

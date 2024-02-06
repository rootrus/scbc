package p040o;

import p040o.setDataStoreName;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDataStoreName$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver */
final class C5292x22520fd0<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_OnDevicePassportDeserializer_Factory> {
    private /* synthetic */ String read;

    C5292x22520fd0(String str) {
        this.read = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        PassportCaptureModule_OnDevicePassportDeserializer_Factory passportCaptureModule_OnDevicePassportDeserializer_Factory = (PassportCaptureModule_OnDevicePassportDeserializer_Factory) obj;
        passportCaptureModule_OnDevicePassportDeserializer_Factory.MediaBrowserCompat$ItemReceiver(true);
        passportCaptureModule_OnDevicePassportDeserializer_Factory.IconCompatParcelizer(true, setDataStoreName.read.FIRST);
        passportCaptureModule_OnDevicePassportDeserializer_Factory.IconCompatParcelizer(true, setDataStoreName.read.SECOND);
        passportCaptureModule_OnDevicePassportDeserializer_Factory.IconCompatParcelizer(true, setDataStoreName.read.THIRD);
        passportCaptureModule_OnDevicePassportDeserializer_Factory.IconCompatParcelizer(false);
        if (this.read.equals("3029")) {
            passportCaptureModule_OnDevicePassportDeserializer_Factory.IconCompatParcelizer();
        } else {
            passportCaptureModule_OnDevicePassportDeserializer_Factory.MediaBrowserCompat$MediaItem();
        }
    }
}

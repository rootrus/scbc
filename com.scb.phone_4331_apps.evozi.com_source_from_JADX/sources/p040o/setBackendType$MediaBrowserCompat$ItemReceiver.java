package p040o;

import p040o.CrashlyticsController;
import p040o.writeUInt64NoTag;

/* renamed from: o.setBackendType$MediaBrowserCompat$ItemReceiver */
public final class setBackendType$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetOnDevicePassportDeserializerFactory> {
    private /* synthetic */ CrashlyticsController.FileNameContainsFilter MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ setBackendType write;

    public setBackendType$MediaBrowserCompat$ItemReceiver(setBackendType setbackendtype, CrashlyticsController.FileNameContainsFilter fileNameContainsFilter) {
        this.write = setbackendtype;
        this.MediaBrowserCompat$CustomActionResultReceiver = fileNameContainsFilter;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule_GetOnDevicePassportDeserializerFactory) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.write.MediaBrowserCompat$ItemReceiver);
    }
}

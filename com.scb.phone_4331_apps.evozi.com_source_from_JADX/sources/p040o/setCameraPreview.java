package p040o;

import p040o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCameraPreview */
public final /* synthetic */ class setCameraPreview implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nonNull MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setCameraPreview(nonNull nonnull) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nonnull;
    }

    public final void IconCompatParcelizer(Object obj) {
        loadFromString.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, (IdCaptureModule_GetIIdDeserializerOnDeviceFactory.read) obj);
    }
}

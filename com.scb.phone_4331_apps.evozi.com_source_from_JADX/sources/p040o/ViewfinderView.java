package p040o;

import p040o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.ViewfinderView */
public final /* synthetic */ class ViewfinderView implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ loadFromString MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ViewfinderView(loadFromString loadfromstring) {
        this.MediaBrowserCompat$ItemReceiver = loadfromstring;
    }

    public final void IconCompatParcelizer(Object obj) {
        loadFromString loadfromstring = this.MediaBrowserCompat$ItemReceiver;
        IdCaptureModule_GetIIdDeserializerOnDeviceFactory.read read = (IdCaptureModule_GetIIdDeserializerOnDeviceFactory.read) obj;
        if (!loadfromstring.read && loadfromstring.IconCompatParcelizer) {
            read.MediaBrowserCompat$CustomActionResultReceiver();
        } else if (!loadfromstring.read) {
        } else {
            if (loadfromstring.IconCompatParcelizer) {
                read.read();
            } else {
                read.write();
            }
        }
    }
}

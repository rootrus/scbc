package p040o;

import java.util.List;
import p040o.nativeGetRows;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeExistsTable */
public final /* synthetic */ class nativeExistsTable implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeGetRows.read MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List read;

    public /* synthetic */ nativeExistsTable(nativeGetRows.read read2, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read2;
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeGetRows.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        List list = this.read;
        IdCaptureModule_GetIIdExtractionServerOnDeviceFactory idCaptureModule_GetIIdExtractionServerOnDeviceFactory = (IdCaptureModule_GetIIdExtractionServerOnDeviceFactory) obj;
        idCaptureModule_GetIIdExtractionServerOnDeviceFactory.IconCompatParcelizer(list);
        idCaptureModule_GetIIdExtractionServerOnDeviceFactory.MediaBrowserCompat$ItemReceiver(nativeGetRows.this.read(0));
        idCaptureModule_GetIIdExtractionServerOnDeviceFactory.MediaBrowserCompat$CustomActionResultReceiver(list.size() <= 10);
    }
}

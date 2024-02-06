package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getAllFilesInDirectory */
public final /* synthetic */ class getAllFilesInDirectory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzwo MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getAllFilesInDirectory(zzwo zzwo) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzwo;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((ICheckExtractionServer) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

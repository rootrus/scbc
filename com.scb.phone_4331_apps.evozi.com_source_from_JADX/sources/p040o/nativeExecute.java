package p040o;

import java.util.List;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeExecute */
public final /* synthetic */ class nativeExecute implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getSessionFileProvider write;

    public /* synthetic */ nativeExecute(List list, getSessionFileProvider getsessionfileprovider) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.write = getsessionfileprovider;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetLookAndFeelParametersFactory.MediaDescriptionCompat) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.write.ParcelableVolumeInfo);
    }
}

package p040o;

import java.util.List;
import p040o.IdParameters;
import p040o.nativeConfigureFromFile;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeGetProcessedImage */
public final /* synthetic */ class nativeGetProcessedImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigureFromFile.write MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List read;

    public /* synthetic */ nativeGetProcessedImage(nativeConfigureFromFile.write write, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigureFromFile.write write = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((IdParameters.C6915a) obj).write(nativeConfigureFromFile.this.IconCompatParcelizer.IconCompatParcelizer(this.read, nativeConfigureFromFile.this.MediaMetadataCompat.setCheckable()));
    }
}

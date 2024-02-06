package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.DataCollectionConfigStorage */
public final /* synthetic */ class DataCollectionConfigStorage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C9742xdf6f648 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ DataCollectionConfigStorage(C9742xdf6f648 firebaseVisionImageMetadata$MediaBrowserCompat$CustomActionResultReceiver, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = firebaseVisionImageMetadata$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C9742xdf6f648 firebaseVisionImageMetadata$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver;
        ((Extractor) obj).write(firebaseVisionImageMetadata$MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS));
    }
}

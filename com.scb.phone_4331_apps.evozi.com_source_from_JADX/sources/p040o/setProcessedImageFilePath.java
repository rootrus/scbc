package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;
import p040o.zzbt;

/* renamed from: o.setProcessedImageFilePath */
public final /* synthetic */ class setProcessedImageFilePath implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C3489xb1380098 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ zzbt.zzf write;

    public /* synthetic */ setProcessedImageFilePath(C3489xb1380098 imageProcessor$ProcessProgressEvent$MediaBrowserCompat$CustomActionResultReceiver, zzbt.zzf zzf) {
        this.MediaBrowserCompat$CustomActionResultReceiver = imageProcessor$ProcessProgressEvent$MediaBrowserCompat$CustomActionResultReceiver;
        this.write = zzf;
    }

    public final void IconCompatParcelizer(Object obj) {
        C3489xb1380098 imageProcessor$ProcessProgressEvent$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        zzbt.zzf zzf = this.write;
        CheckExtractActivity_MembersInjector.setCheckable setcheckable = (CheckExtractActivity_MembersInjector.setCheckable) obj;
        if (zzf.read) {
            setcheckable.IconCompatParcelizer(zzf.MediaBrowserCompat$ItemReceiver, zzf.MediaBrowserCompat$CustomActionResultReceiver);
        } else if (zzf.MediaBrowserCompat$ItemReceiver) {
            if (imageProcessor$ProcessProgressEvent$MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$MediaItem) {
                setcheckable.IconCompatParcelizer(zzf.MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                setcheckable.read(zzf.MediaBrowserCompat$CustomActionResultReceiver);
            }
        } else if (zzf.MediaBrowserCompat$CustomActionResultReceiver) {
            setcheckable.MediaBrowserCompat$ItemReceiver();
        } else {
            setcheckable.IconCompatParcelizer();
        }
    }
}

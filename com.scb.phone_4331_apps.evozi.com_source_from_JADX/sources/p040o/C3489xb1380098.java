package p040o;

import p040o.ImageProcessor;
import p040o.access$2300;
import p040o.zzbt;

/* renamed from: o.ImageProcessor$ProcessProgressEvent$MediaBrowserCompat$CustomActionResultReceiver */
public class C3489xb1380098 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzbt.zzf> {
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    final /* synthetic */ ImageProcessor.ProcessProgressEvent read;

    public final /* synthetic */ void onNext(Object obj) {
        zzbt.zzf zzf = (zzbt.zzf) obj;
        ImageProcessor.ProcessProgressEvent.MediaBrowserCompat$MediaItem(this.read);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver();
            return;
        }
        ImageProcessor.ProcessProgressEvent processProgressEvent = this.read;
        setProcessedImageFilePath setprocessedimagefilepath = new setProcessedImageFilePath(this, zzf);
        if (processProgressEvent.RatingCompat != null) {
            setprocessedimagefilepath.IconCompatParcelizer(processProgressEvent.RatingCompat);
        }
    }

    public C3489xb1380098(ImageProcessor.ProcessProgressEvent processProgressEvent, boolean z) {
        this.read = processProgressEvent;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void onError(Throwable th) {
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}

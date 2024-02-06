package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.forceTakePictureForCaptureExperience */
public final /* synthetic */ class forceTakePictureForCaptureExperience implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setImageResolution IconCompatParcelizer;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ forceTakePictureForCaptureExperience(setImageResolution setimageresolution, Throwable th) {
        this.IconCompatParcelizer = setimageresolution;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageResolution setimageresolution = this.IconCompatParcelizer;
        ((C1355x8de47d61) obj).write(setimageresolution.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
    }
}

package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAllowableImageResolutions */
public final /* synthetic */ class getAllowableImageResolutions implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setImageResolution read;

    public /* synthetic */ getAllowableImageResolutions(setImageResolution setimageresolution, Throwable th) {
        this.read = setimageresolution;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageResolution setimageresolution = this.read;
        ((C1355x8de47d61) obj).IconCompatParcelizer(setimageresolution.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}

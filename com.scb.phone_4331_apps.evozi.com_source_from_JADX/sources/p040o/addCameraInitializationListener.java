package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.addCameraInitializationListener */
public final /* synthetic */ class addCameraInitializationListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ setImageResolution write;

    public /* synthetic */ addCameraInitializationListener(setImageResolution setimageresolution, Throwable th) {
        this.write = setimageresolution;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageResolution setimageresolution = this.write;
        ((C1355x8de47d61) obj).write(setimageresolution.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS));
    }
}

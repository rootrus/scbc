package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.setLinkText */
public final class setLinkText {
    private static final AtomicReference<setLinkText> read = new AtomicReference<>();
    private final CameraApi2$CameraHardwareNotSupportException IconCompatParcelizer = ImageAndTextAdBannerView_ViewBinding.MediaBrowserCompat$ItemReceiver();
    private final CameraApi2$CameraHardwareNotSupportException MediaBrowserCompat$CustomActionResultReceiver = ImageAndTextAdBannerView_ViewBinding.write();
    private final CameraApi2$CameraHardwareNotSupportException write = ImageAndTextAdBannerView_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();

    private static setLinkText MediaBrowserCompat$CustomActionResultReceiver() {
        while (true) {
            setLinkText setlinktext = read.get();
            if (setlinktext != null) {
                return setlinktext;
            }
            setLinkText setlinktext2 = new setLinkText();
            if (read.compareAndSet((Object) null, setlinktext2)) {
                return setlinktext2;
            }
            setlinktext2.MediaBrowserCompat$ItemReceiver();
        }
    }

    private setLinkText() {
        DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().write();
    }

    public static CameraApi2$CameraHardwareNotSupportException IconCompatParcelizer() {
        return MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static CameraApi2$CameraHardwareNotSupportException write() {
        return MediaBrowserCompat$CustomActionResultReceiver().write;
    }

    private void MediaBrowserCompat$ItemReceiver() {
        synchronized (this) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver instanceof CustomInformationList_ViewBinding) {
                ((CustomInformationList_ViewBinding) this.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver();
            }
            if (this.write instanceof CustomInformationList_ViewBinding) {
                ((CustomInformationList_ViewBinding) this.write).MediaBrowserCompat$ItemReceiver();
            }
            if (this.IconCompatParcelizer instanceof CustomInformationList_ViewBinding) {
                ((CustomInformationList_ViewBinding) this.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver();
            }
        }
    }
}

package p040o;

import p040o.CameraApi2$CameraHardwareNotSupportException;

/* renamed from: o.setTitleBackground */
final class setTitleBackground implements setImageWidth {
    private final CameraApi2$CameraHardwareNotSupportException.write IconCompatParcelizer;
    private final setImageWidth MediaBrowserCompat$CustomActionResultReceiver;
    private final long write;

    public setTitleBackground(setImageWidth setimagewidth, CameraApi2$CameraHardwareNotSupportException.write write2, long j) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setimagewidth;
        this.IconCompatParcelizer = write2;
        this.write = j;
    }

    public final void IconCompatParcelizer() {
        if (!this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver()) {
            long currentTimeMillis = this.write - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                try {
                    Thread.sleep(currentTimeMillis);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
            }
            if (!this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver()) {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            }
        }
    }
}

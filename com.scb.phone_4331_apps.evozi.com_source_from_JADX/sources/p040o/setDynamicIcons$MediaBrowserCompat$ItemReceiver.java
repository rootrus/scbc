package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p040o.CameraApi2$CameraHardwareNotSupportException;
import p040o.CustomInformationList;
import p040o.setDynamicIcons;

/* renamed from: o.setDynamicIcons$MediaBrowserCompat$ItemReceiver */
final class setDynamicIcons$MediaBrowserCompat$ItemReceiver extends CameraApi2$CameraHardwareNotSupportException.write {
    private AtomicBoolean MediaBrowserCompat$CustomActionResultReceiver;
    private final setDynamicIcons.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    final setIconBottom read = new setIconBottom();
    private final setDynamicIcons.write write;

    setDynamicIcons$MediaBrowserCompat$ItemReceiver(setDynamicIcons.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = new AtomicBoolean();
        this.write = iconCompatParcelizer.read();
    }

    public final void write() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(false, true)) {
            setDynamicIcons.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
            setDynamicIcons.write write2 = this.write;
            write2.read = System.nanoTime() + iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.offer(write2);
        }
        this.read.write();
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.read.MediaBrowserCompat$ItemReceiver;
    }

    public final CustomDoubleCircleBorderView MediaBrowserCompat$ItemReceiver(setImageWidth setimagewidth) {
        return IconCompatParcelizer(setimagewidth, 0, (TimeUnit) null);
    }

    public final CustomDoubleCircleBorderView IconCompatParcelizer(final setImageWidth setimagewidth, long j, TimeUnit timeUnit) {
        if (this.read.MediaBrowserCompat$ItemReceiver) {
            return setAddButton.MediaBrowserCompat$ItemReceiver();
        }
        CustomInformationList read2 = this.write.read(new setImageWidth() {
            public final void IconCompatParcelizer() {
                if (!setDynamicIcons$MediaBrowserCompat$ItemReceiver.this.read.MediaBrowserCompat$ItemReceiver) {
                    setimagewidth.IconCompatParcelizer();
                }
            }
        }, j, timeUnit);
        this.read.MediaBrowserCompat$ItemReceiver(read2);
        read2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new CustomInformationList.write(read2, this.read));
        return read2;
    }
}

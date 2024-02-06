package p040o;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.CameraApi2$CameraHardwareNotSupportException;

/* renamed from: o.setBottomViewVisibility */
public final class setBottomViewVisibility extends CameraApi2$CameraHardwareNotSupportException {
    static int MediaBrowserCompat$ItemReceiver(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public final CameraApi2$CameraHardwareNotSupportException.write IconCompatParcelizer() {
        return new IconCompatParcelizer();
    }

    private setBottomViewVisibility() {
    }

    /* renamed from: o.setBottomViewVisibility$IconCompatParcelizer */
    static class IconCompatParcelizer extends CameraApi2$CameraHardwareNotSupportException.write {
        private AtomicInteger IconCompatParcelizer = new AtomicInteger();
        private final AtomicInteger MediaBrowserCompat$CustomActionResultReceiver = new AtomicInteger();
        final PriorityBlockingQueue<C7452xd3026bb1> read = new PriorityBlockingQueue<>();
        private final setDeleteIcon write = new setDeleteIcon();

        IconCompatParcelizer() {
        }

        private CustomDoubleCircleBorderView write(setImageWidth setimagewidth, long j) {
            if (this.write.write.get() == setDeleteIcon.IconCompatParcelizer) {
                return setAddButton.MediaBrowserCompat$ItemReceiver();
            }
            final C7452xd3026bb1 setbottomviewvisibility_mediabrowsercompat_customactionresultreceiver = new C7452xd3026bb1(setimagewidth, Long.valueOf(j), this.IconCompatParcelizer.incrementAndGet());
            this.read.add(setbottomviewvisibility_mediabrowsercompat_customactionresultreceiver);
            if (this.MediaBrowserCompat$CustomActionResultReceiver.getAndIncrement() != 0) {
                return setAddButton.write(new setImageWidth() {
                    public final void IconCompatParcelizer() {
                        IconCompatParcelizer.this.read.remove(setbottomviewvisibility_mediabrowsercompat_customactionresultreceiver);
                    }
                });
            }
            do {
                C7452xd3026bb1 poll = this.read.poll();
                if (poll != null) {
                    poll.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
                }
            } while (this.MediaBrowserCompat$CustomActionResultReceiver.decrementAndGet() > 0);
            return setAddButton.MediaBrowserCompat$ItemReceiver();
        }

        public final void write() {
            this.write.write();
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return this.write.write.get() == setDeleteIcon.IconCompatParcelizer;
        }

        public final CustomDoubleCircleBorderView MediaBrowserCompat$ItemReceiver(setImageWidth setimagewidth) {
            return write(setimagewidth, System.currentTimeMillis());
        }

        public final CustomDoubleCircleBorderView IconCompatParcelizer(setImageWidth setimagewidth, long j, TimeUnit timeUnit) {
            long currentTimeMillis = System.currentTimeMillis() + timeUnit.toMillis(j);
            return write(new setTitleBackground(setimagewidth, this, currentTimeMillis), currentTimeMillis);
        }
    }
}

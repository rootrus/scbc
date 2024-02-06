package p040o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p040o.CameraApi2$CameraHardwareNotSupportException;
import p043rx.exceptions.OnErrorNotImplementedException;

/* renamed from: o.setBorderAnimationListener */
final class setBorderAnimationListener extends CameraApi2$CameraHardwareNotSupportException {
    private final Handler write;

    setBorderAnimationListener(Looper looper) {
        this.write = new Handler(looper);
    }

    public final CameraApi2$CameraHardwareNotSupportException.write IconCompatParcelizer() {
        return new write(this.write);
    }

    /* renamed from: o.setBorderAnimationListener$write */
    static class write extends CameraApi2$CameraHardwareNotSupportException.write {
        private volatile boolean IconCompatParcelizer;
        private final Handler MediaBrowserCompat$ItemReceiver;

        write(Handler handler) {
            this.MediaBrowserCompat$ItemReceiver = handler;
            setHideChildrenWhenUnchecked.MediaBrowserCompat$CustomActionResultReceiver().IconCompatParcelizer();
        }

        public final void write() {
            this.IconCompatParcelizer = true;
            this.MediaBrowserCompat$ItemReceiver.removeCallbacksAndMessages(this);
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return this.IconCompatParcelizer;
        }

        public final CustomDoubleCircleBorderView IconCompatParcelizer(setImageWidth setimagewidth, long j, TimeUnit timeUnit) {
            if (this.IconCompatParcelizer) {
                return setAddButton.MediaBrowserCompat$ItemReceiver();
            }
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(CustomCheckboxView.read(setimagewidth), this.MediaBrowserCompat$ItemReceiver);
            Message obtain = Message.obtain(this.MediaBrowserCompat$ItemReceiver, iconCompatParcelizer);
            obtain.obj = this;
            this.MediaBrowserCompat$ItemReceiver.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.IconCompatParcelizer) {
                return iconCompatParcelizer;
            }
            this.MediaBrowserCompat$ItemReceiver.removeCallbacks(iconCompatParcelizer);
            return setAddButton.MediaBrowserCompat$ItemReceiver();
        }

        public final CustomDoubleCircleBorderView MediaBrowserCompat$ItemReceiver(setImageWidth setimagewidth) {
            return IconCompatParcelizer(setimagewidth, 0, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: o.setBorderAnimationListener$IconCompatParcelizer */
    static final class IconCompatParcelizer implements Runnable, CustomDoubleCircleBorderView {
        private final Handler MediaBrowserCompat$CustomActionResultReceiver;
        private volatile boolean MediaBrowserCompat$ItemReceiver;
        private final setImageWidth read;

        IconCompatParcelizer(setImageWidth setimagewidth, Handler handler) {
            this.read = setimagewidth;
            this.MediaBrowserCompat$CustomActionResultReceiver = handler;
        }

        public final void run() {
            IllegalStateException illegalStateException;
            try {
                this.read.IconCompatParcelizer();
            } catch (Throwable th) {
                if (th instanceof OnErrorNotImplementedException) {
                    illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th);
                } else {
                    illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
                }
                DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
            }
        }

        public final void write() {
            this.MediaBrowserCompat$ItemReceiver = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacks(this);
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return this.MediaBrowserCompat$ItemReceiver;
        }
    }
}

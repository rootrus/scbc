package p040o;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.CustomInformationList */
public final class CustomInformationList extends AtomicReference<Thread> implements Runnable, CustomDoubleCircleBorderView {
    final DraggableFloatingActionButton MediaBrowserCompat$CustomActionResultReceiver;
    private setImageWidth write;

    public CustomInformationList(setImageWidth setimagewidth) {
        this.write = setimagewidth;
        this.MediaBrowserCompat$CustomActionResultReceiver = new DraggableFloatingActionButton();
    }

    public CustomInformationList(setImageWidth setimagewidth, setIconBottom seticonbottom) {
        this.write = setimagewidth;
        this.MediaBrowserCompat$CustomActionResultReceiver = new DraggableFloatingActionButton((CustomDoubleCircleBorderView) new write(this, seticonbottom));
    }

    public CustomInformationList(setImageWidth setimagewidth, DraggableFloatingActionButton draggableFloatingActionButton) {
        this.write = setimagewidth;
        this.MediaBrowserCompat$CustomActionResultReceiver = new DraggableFloatingActionButton((CustomDoubleCircleBorderView) new CustomInformationList$MediaBrowserCompat$ItemReceiver(this, draggableFloatingActionButton));
    }

    public final void run() {
        IllegalStateException illegalStateException;
        try {
            lazySet(Thread.currentThread());
            this.write.IconCompatParcelizer();
        } catch (Throwable th) {
            write();
            throw th;
        }
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.read) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write();
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.read;
    }

    public final void write() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.read) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write();
        }
    }

    /* renamed from: o.CustomInformationList$read */
    final class read implements CustomDoubleCircleBorderView {
        private final Future<?> write;

        read(Future<?> future) {
            this.write = future;
        }

        public final void write() {
            if (CustomInformationList.this.get() != Thread.currentThread()) {
                this.write.cancel(true);
            } else {
                this.write.cancel(false);
            }
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return this.write.isCancelled();
        }
    }

    /* renamed from: o.CustomInformationList$write */
    static final class write extends AtomicBoolean implements CustomDoubleCircleBorderView {
        private CustomInformationList read;
        private setIconBottom write;

        public write(CustomInformationList customInformationList, setIconBottom seticonbottom) {
            this.read = customInformationList;
            this.write = seticonbottom;
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return this.read.MediaBrowserCompat$CustomActionResultReceiver.read;
        }

        public final void write() {
            if (compareAndSet(false, true)) {
                this.write.read((CustomDoubleCircleBorderView) this.read);
            }
        }
    }
}

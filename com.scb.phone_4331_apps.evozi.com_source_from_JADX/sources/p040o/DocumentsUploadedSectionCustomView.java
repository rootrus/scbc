package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.DocumentsUploadedSectionCustomView */
public final class DocumentsUploadedSectionCustomView implements CustomDoubleCircleBorderView {
    public final AtomicReference<write> IconCompatParcelizer = new AtomicReference<>(new write(false, setAddButton.MediaBrowserCompat$CustomActionResultReceiver()));

    /* renamed from: o.DocumentsUploadedSectionCustomView$write */
    public static final class write {
        public final CustomDoubleCircleBorderView MediaBrowserCompat$CustomActionResultReceiver;
        public final boolean read;

        public write(boolean z, CustomDoubleCircleBorderView customDoubleCircleBorderView) {
            this.read = z;
            this.MediaBrowserCompat$CustomActionResultReceiver = customDoubleCircleBorderView;
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer.get().read;
    }

    public final void write() {
        write write2;
        AtomicReference<write> atomicReference = this.IconCompatParcelizer;
        do {
            write2 = atomicReference.get();
            if (write2.read) {
                return;
            }
        } while (!atomicReference.compareAndSet(write2, new write(true, write2.MediaBrowserCompat$CustomActionResultReceiver)));
        write2.MediaBrowserCompat$CustomActionResultReceiver.write();
    }
}

package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.setDeleteIcon */
public final class setDeleteIcon implements CustomDoubleCircleBorderView {
    public static final setImageWidth IconCompatParcelizer = new setImageWidth() {
        public final void IconCompatParcelizer() {
        }
    };
    public final AtomicReference<setImageWidth> write;

    public setDeleteIcon() {
        this.write = new AtomicReference<>();
    }

    private setDeleteIcon(setImageWidth setimagewidth) {
        this.write = new AtomicReference<>(setimagewidth);
    }

    public static setDeleteIcon read() {
        return new setDeleteIcon();
    }

    public static setDeleteIcon write(setImageWidth setimagewidth) {
        return new setDeleteIcon(setimagewidth);
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.write.get() == IconCompatParcelizer;
    }

    public final void write() {
        setImageWidth andSet;
        setImageWidth setimagewidth = this.write.get();
        setImageWidth setimagewidth2 = IconCompatParcelizer;
        if (setimagewidth != setimagewidth2 && (andSet = this.write.getAndSet(setimagewidth2)) != null && andSet != IconCompatParcelizer) {
            andSet.IconCompatParcelizer();
        }
    }
}

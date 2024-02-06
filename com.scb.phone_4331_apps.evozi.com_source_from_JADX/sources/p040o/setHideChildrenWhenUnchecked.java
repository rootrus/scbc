package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.setHideChildrenWhenUnchecked */
public final class setHideChildrenWhenUnchecked {
    private static final setHideChildrenWhenUnchecked write = new setHideChildrenWhenUnchecked();
    private final AtomicReference<CustomCheckboxView> IconCompatParcelizer = new AtomicReference<>();

    public static setHideChildrenWhenUnchecked MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }

    setHideChildrenWhenUnchecked() {
    }

    public final CustomCheckboxView IconCompatParcelizer() {
        if (this.IconCompatParcelizer.get() == null) {
            this.IconCompatParcelizer.compareAndSet((Object) null, CustomCheckboxView.MediaBrowserCompat$CustomActionResultReceiver());
        }
        return this.IconCompatParcelizer.get();
    }
}

package p040o;

import p040o.setAccessibilityDelegateCompat;
import p040o.setClipToPadding;
import p040o.setOnCloseListener;

/* renamed from: o.performDestroyView */
final class performDestroyView<Z> implements performOptionsMenuClosed<Z>, setAccessibilityDelegateCompat.write {
    private static final setOnCloseListener.read<performDestroyView<?>> read = setAccessibilityDelegateCompat.MediaBrowserCompat$ItemReceiver(20, new C1446x798357e0<performDestroyView<?>>() {
        public final /* synthetic */ Object read() {
            return new performDestroyView();
        }
    });
    private final setClipToPadding IconCompatParcelizer = new setClipToPadding.write();
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private performOptionsMenuClosed<Z> MediaBrowserCompat$ItemReceiver;
    private boolean write;

    static <Z> performDestroyView<Z> read(performOptionsMenuClosed<Z> performoptionsmenuclosed) {
        performDestroyView<Z> read2 = read.read();
        if (read2 != null) {
            performDestroyView<Z> performdestroyview = read2;
            performdestroyview.MediaBrowserCompat$CustomActionResultReceiver = false;
            performdestroyview.write = true;
            performdestroyview.MediaBrowserCompat$ItemReceiver = performoptionsmenuclosed;
            return performdestroyview;
        }
        throw new NullPointerException("Argument must not be null");
    }

    performDestroyView() {
    }

    /* access modifiers changed from: package-private */
    public final void RatingCompat() {
        synchronized (this) {
            this.IconCompatParcelizer.write();
            if (this.write) {
                this.write = false;
                if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                    MediaBrowserCompat$CustomActionResultReceiver();
                }
            } else {
                throw new IllegalStateException("Already unlocked");
            }
        }
    }

    public final Class<Z> IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
    }

    public final Z write() {
        return this.MediaBrowserCompat$ItemReceiver.write();
    }

    public final int read() {
        return this.MediaBrowserCompat$ItemReceiver.read();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        synchronized (this) {
            this.IconCompatParcelizer.write();
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            if (!this.write) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
                this.MediaBrowserCompat$ItemReceiver = null;
                read.MediaBrowserCompat$CustomActionResultReceiver(this);
            }
        }
    }

    public final setClipToPadding MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer;
    }
}
